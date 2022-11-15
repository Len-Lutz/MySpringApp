package com.spring.MySpringApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InfoRequestController {

	@GetMapping(value="/")
	public String index(InfoRequest infoRequest) {
		return "inforequest/index";
	}

}
