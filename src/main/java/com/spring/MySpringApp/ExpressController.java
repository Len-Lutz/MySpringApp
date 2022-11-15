package com.spring.MySpringApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExpressController {

	@GetMapping(value="/express")
	public String index(InfoRequest infoRequest) {
		return "inforequest/express";
	}

}
