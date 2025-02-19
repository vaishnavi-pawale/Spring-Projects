package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Entity.Employee;

@Controller
public class HomeController {

	private final static String USERNAME = "admin";
	private final static String PASSWORD = "admin123";

	@RequestMapping(value = "/log")
	public String getMassege(@RequestParam("username") String un, @RequestParam("password") String ps) {

		System.out.println("usernsme -: " + un);
		System.out.println("passwaord :-" + ps);

		if (un.equalsIgnoreCase(USERNAME) && ps.equalsIgnoreCase(PASSWORD)) {
			return "success";
		} else {
			return "login";
		}

	}
	
	@RequestMapping(value = "/reg")
	public String registerEmployee(@ModelAttribute Employee emp) {
		
		System.out.println("Employee info");
		System.out.println(emp);
		
		if(emp != null) {
			return "login";
		}else {
			return "register";
		}
	}
	
	
	
}
