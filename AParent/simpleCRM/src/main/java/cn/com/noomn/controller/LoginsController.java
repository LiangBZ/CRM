package cn.com.noomn.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.noomn.util.Infos;
import cn.com.noomn.util.Message;
import cn.com.noomn.util.RSAModel;
import cn.com.noomn.vo.EmployeeVo;

@Controller
@RequestMapping(value="/logins/")
public class LoginsController {
	
	@Autowired
	private cn.com.noomn.service.LoginsService loginsService;
	
	@ModelAttribute
	private void getModel (
			Map<String, Object> map,
			EmployeeVo employeeVo) {
		employeeVo = loginsService.selectEmployee(employeeVo);
		map.put("employeeVo", employeeVo);
	}
	
	/**
	 * 登录验证
	 * @param employeeVo
	 * @param map
	 * @param session
	 * @param referer
	 * @return
	 */
	@RequestMapping(value="login")
	private String login(
			EmployeeVo employeeVo, 
			Map<String, Object> map, 
			HttpSession session,  
			@RequestHeader ("Referer") String referer) {
		
//		请求来源过滤
		if(!referer.equals("http://localhost:8080/simpleCRM/"))
			return "redirect:/";

//		RSA解密
		String employeeRSAPassword = employeeVo.getEmployeeRSAPassword();
		String privateExponent = (String) session.getAttribute("privateExponent");
		String privateKeyModulus = (String) session.getAttribute("privateKeyModulus");
		try {
			String password = RSAModel.deciphering(privateKeyModulus, privateExponent, employeeRSAPassword);
			employeeVo.setEmployeePassword(password);
		} catch (Exception e) {
			e.printStackTrace();
			return "mainBody/jsp/500";
		}
		
//		与数据库对比
		try {
			boolean isExist = loginsService.selectForlogin(employeeVo);
			if(isExist) {
				return "mainBody/jsp/welcome";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "mainBody/jsp/500";
		}
		
//		提示消息
		Infos infos = Infos.getInfosInstance();
		infos.setMessage(Message.ERROR);
		infos.setObj("用户名或者密码错误");
		map.put("infos", infos);
		return "login/index";
	}
	
}
