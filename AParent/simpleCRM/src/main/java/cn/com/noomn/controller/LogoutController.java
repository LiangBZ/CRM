package cn.com.noomn.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/logout/")
public class LogoutController {

	@RequestMapping(value="removeSession")
	public String removeSession(HttpSession session) {
		session.removeAttribute("employeeRealName");
		session.removeAttribute("authorityMap");
		return "redirect:/";
	}
}
