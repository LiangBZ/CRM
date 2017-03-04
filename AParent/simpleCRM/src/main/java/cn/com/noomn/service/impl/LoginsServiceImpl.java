package cn.com.noomn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.noomn.mapper.vo.EmployeeVoMapper;
import cn.com.noomn.service.LoginsService;
import cn.com.noomn.vo.EmployeeVo;

@Service
public class LoginsServiceImpl implements LoginsService {
	
	@Autowired
	private EmployeeVoMapper employeeVoMapper;

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

}
