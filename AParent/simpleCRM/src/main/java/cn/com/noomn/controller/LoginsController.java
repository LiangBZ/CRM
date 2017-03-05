package cn.com.noomn.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
		if(employeeVo != null) {
			map.put("employeeVo", employeeVo);
			map.put("instruct", employeeVo.getEmployeeInstruct());
		}
		else map.put("errorMessage", "查无此人");
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
	
	/**
	 * 发送邮件（用于重置密码）
	 * @param employeeVo
	 * @param map
	 * @param referer
	 * @return
	 */
	@RequestMapping(value="sendEmailForResetPassword")
	@ResponseBody
	private Infos sendEmailForResetPassword(
			EmployeeVo employeeVo,
			Map<String, Object> map,
			@RequestHeader ("Referer") String referer) {
		
//		请求来源过滤
		if(!referer.equals("http://localhost:8080/simpleCRM/")) {
			Infos info = Infos.getInfosInstance();
			info.message = Message.WARN;
			info.obj = "请从指定页面重置密码";
			return info; 
		}
		
//		用户和邮箱是否配对
		Object errorMessage = map.get("errorMessage");
		if(errorMessage != null) {
			Infos info = Infos.getInfosInstance();
			info.message = Message.WARN;
			info.obj = "用户名 或 邮箱 错误";
			return info; 
		}
		
//		发送邮件
		Infos info = loginsService.sendEmail(employeeVo);
		return info;
	}
	
	/**
	 * 重置密码
	 * @param employeeVo
	 * @param map
	 * @param referer
	 * @return
	 */
	@RequestMapping(value="resetPassword", method = {RequestMethod.POST})
	@ResponseBody
	private Infos resetPassword(
			EmployeeVo employeeVo,
			Map<String, Object> map,
			@RequestHeader ("Referer") String referer) {
		
//		请求来源过滤
		if(!referer.equals("http://localhost:8080/simpleCRM/")) {
			Infos info = Infos.getInfosInstance();
			info.message = Message.WARN;
			info.obj = "请从指定页面重置密码";
			return info;
		}
		
//		用户和邮箱是否配对
		Object errorMessage = map.get("errorMessage");
		if(errorMessage != null) {
			Infos info = Infos.getInfosInstance();
			info.message = Message.WARN;
			info.obj = "用户名 或 邮箱 或 验证码 错误";
			return info;
		}
		
		Infos info = Infos.getInfosInstance();
		if(!((String)map.get("instruct")).equals(employeeVo.getEmployeeInstruct())) {
			info.message = Message.WARN;
			info.obj = "验证码错误";
			return info;
		}
		
		employeeVo.setEmployeePassword("123456");
		employeeVo.setEmployeeInstruct("");
		int updateRecordNum = loginsService.updateEmployeeByPrimaryKey(employeeVo);

		if(updateRecordNum > 0) {
			info.message = Message.SUCCESS;
			info.obj = "重置密码成功";
		}else {
			info.message = Message.ERROR;
			info.obj = "重置密码失败";
		}
		return info;
	}
}
