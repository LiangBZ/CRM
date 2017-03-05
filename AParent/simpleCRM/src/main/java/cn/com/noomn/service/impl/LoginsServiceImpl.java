package cn.com.noomn.service.impl;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.noomn.mapper.vo.EmployeeVoMapper;
import cn.com.noomn.service.LoginsService;
import cn.com.noomn.util.DataUtil;
import cn.com.noomn.util.Infos;
import cn.com.noomn.util.JavaMail;
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
		try {
			return employeeVoMapper.selectForlogin(employeeVo) == null ? false : true ;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Override
	public EmployeeVo selectEmployee(EmployeeVo employeeVo) {
		try {
			return employeeVoMapper.selectForNimble(employeeVo);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Override
	public Infos sendEmail(EmployeeVo employeeVo) {
		String employeeInstruct = String.valueOf(RandomUtil.getRandomNumber(1000, 10000));
		employeeVo.setEmployeeInstruct(employeeInstruct);
		employeeVo.setEmployeeUsefulTime(new Date(DataUtil.getNextDay()));
		
		String employeeEmail = employeeVo.getEmployeeEmail();
		JavaMail.sendMail(employeeEmail, employeeInstruct);
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

}
