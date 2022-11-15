package com.spring.MySpringApp;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

	@Autowired
	private MySpringAppRepository mySpringAppRepository;

	@GetMapping(value="/contact")
	public String contact(Model model) {
		InfoRequest infoRequest = new InfoRequest();
		LocalDate today = LocalDate.now();
        infoRequest.setDateRequested(today.toString());
        infoRequest.setPrefContactMethod("E-Mail");

        model.addAttribute("infoRequest", infoRequest);

        List<String> listCallTime = Arrays.asList("9:00am-12:00pm", "1:00pm-5:00pm", "6:00pm-9:00pm");
        model.addAttribute("listCallTime", listCallTime);
         
        List<String> listTimeZone = Arrays.asList("Eastern (New York)", "Central (Chicago)", 
        		"Mountain (Denver)", "Mountain (Phoenix)", "Pacific (Los Angeles)", 
        		"Alaska (Anchorage)", "Hawaii-Aleutian (Honolulu)");
        model.addAttribute("listTimeZone", listTimeZone);

		return "inforequest/contact";
	}

	@PostMapping(value="/contact")
	public String addNewInfoRequest(InfoRequest infoRequest, Model model) {
		mySpringAppRepository.save(new InfoRequest(infoRequest.getFirstName(), infoRequest.getLastName(), 
				infoRequest.getAddress1(), infoRequest.getAddress2(), infoRequest.getCity(), 
				infoRequest.getState(), infoRequest.getZip(), infoRequest.getPhone(), 
				infoRequest.geteMail(), infoRequest.getPrefContactMethod(), infoRequest.getCallTime(), 
				infoRequest.getTimeZone(), infoRequest.isOkMon(), infoRequest.isOkTue(), 
				infoRequest.isOkWed(), infoRequest.isOkThu(), infoRequest.isOkFri(), 
				infoRequest.isOkSat(), infoRequest.isOkSun(), infoRequest.getInfoRequested(), 
				infoRequest.getDateRequested()));

		model.addAttribute("firstName", infoRequest.getFirstName());
		model.addAttribute("lastName", infoRequest.getLastName());
		model.addAttribute("address1", infoRequest.getAddress1());
		model.addAttribute("address2", infoRequest.getAddress2());
		model.addAttribute("city", infoRequest.getCity());
		model.addAttribute("state", infoRequest.getState());
		model.addAttribute("zip", infoRequest.getZip());
		model.addAttribute("phone", infoRequest.getPhone());
		model.addAttribute("eMail", infoRequest.geteMail());
		model.addAttribute("prefContactMethod", infoRequest.getPrefContactMethod());
		model.addAttribute("callTime", infoRequest.getCallTime());
		model.addAttribute("timeZone", infoRequest.getTimeZone());
		model.addAttribute("okMon", infoRequest.isOkMon());
		model.addAttribute("okTue", infoRequest.isOkTue());
		model.addAttribute("okWed", infoRequest.isOkWed());
		model.addAttribute("okThu", infoRequest.isOkThu());
		model.addAttribute("okFri", infoRequest.isOkFri());
		model.addAttribute("okSat", infoRequest.isOkSat());
		model.addAttribute("okSun", infoRequest.isOkSun());
		model.addAttribute("infoRequested", infoRequest.getInfoRequested());
		model.addAttribute("dateRequested", infoRequest.getDateRequested());

		return "infoRequest/result";
	}

}
