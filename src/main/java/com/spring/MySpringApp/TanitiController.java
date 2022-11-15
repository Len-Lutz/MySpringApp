package com.spring.MySpringApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TanitiController {

	@GetMapping(value="/taniti")
	public String index(InfoRequest infoRequest) {
		return "inforequest/taniti";
	}

}
