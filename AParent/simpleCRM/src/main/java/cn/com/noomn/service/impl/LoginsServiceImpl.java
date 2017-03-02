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

	public boolean selectForlogin(EmployeeVo employeeVo) throws Exception {
		return employeeVoMapper.selectForlogin(employeeVo) == null ? false : true ;
	}

}
