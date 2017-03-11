package cn.com.noomn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/mainBodys/")
public class MainBodys {
	
	@RequestMapping(value="loadMainBody")
	private String loadMainBody(String jspURL) {
		return jspURL;
	}
}
