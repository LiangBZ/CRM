package cn.com.noomn.service.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.noomn.mapper.vo.EmployeeVoMapper;
import cn.com.noomn.service.LoginsService;
import cn.com.noomn.util.DataUtil;
import cn.com.noomn.util.Infos;
import cn.com.noomn.util.JavaMail;
import cn.com.noomn.util.MD5Util;
import cn.com.noomn.util.Message;
import cn.com.noomn.util.RandomUtil;
import cn.com.noomn.vo.EmployeeVo;
import cn.com.noomn.mapper.dao.EmployeeMapper;

@Service
public class LoginsServiceImpl implements LoginsService {
	
	@Autowired
	private EmployeeVoMapper employeeVoMapper;
	@Autowired
	private EmployeeMapper employeeMapper;

	@Override
	public boolean selectForlogin(EmployeeVo employeeVo) {
		if(employeeVo != null && employeeVo.getEmployeePassword() != null) {
			employeeVo.setEmployeePassword(MD5Util.EncoderByMd5(employeeVo.getEmployeePassword()));
		}
		try {
			return employeeVoMapper.selectForlogin(employeeVo) == null ? false : true ;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<EmployeeVo> selectEmployee(EmployeeVo employeeVo) {
		if(employeeVo != null && employeeVo.getEmployeePassword() != null) {
			employeeVo.setEmployeePassword(MD5Util.EncoderByMd5(employeeVo.getEmployeePassword()));
		}
		try {
			return employeeVoMapper.selectForNimble(employeeVo);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Override
	public Infos sendEmailForResetPassword(EmployeeVo employeeVo) {
		String employeeInstruct = String.valueOf(RandomUtil.getRandomNumber(1000, 10000));
		employeeVo.setEmployeeInstruct(employeeInstruct);
		employeeVo.setEmployeeUsefulTime(new Date(DataUtil.getNextDay()));
		
		String employeeEmail = employeeVo.getEmployeeEmail();
		JavaMail.sendEmail(employeeEmail,"验证码:", "验证码： " + employeeInstruct);
		employeeMapper.updateByPrimaryKey(employeeVo);
		
		Infos info = Infos.getInfosInstance();
		info.message = Message.SUCCESS;
		info.obj = "发送成功";
		return info;
	}

	@Override
	public int updateEmployeeByPrimaryKey(EmployeeVo employeeVo) {
		return employeeMapper.updateByPrimaryKey(employeeVo);
	}

	@Override
	public Infos sendEmailForMessage(EmployeeVo employeeVo, String title, String mess) {
		JavaMail.sendEmail(employeeVo.getEmployeeEmail(),"密码重置成功", "密码重置成功,请及时修改密码。");
		Infos info = Infos.getInfosInstance();
		info.message = Message.SUCCESS;
		info.obj = mess;
		return info;
	}

}
