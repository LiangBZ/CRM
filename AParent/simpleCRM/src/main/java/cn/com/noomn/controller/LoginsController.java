package cn.com.noomn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.noomn.vo.EmployeeVo;

@Controller
@RequestMapping(value="/logins/")
public class LoginsController {
	
	@Autowired
	private cn.com.noomn.service.LoginsService LoginsService;
	
	@RequestMapping(value="login")
	private String login(String username, String password) {
		EmployeeVo employeeVo = new EmployeeVo();
		employeeVo.setEmployeeUsername(username);
		employeeVo.setEmployeePassword(password);
		
		try {
			if(LoginsService.selectForlogin(employeeVo))
				return "mainBody/jsp/welcome";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "login/index";
	}
}
