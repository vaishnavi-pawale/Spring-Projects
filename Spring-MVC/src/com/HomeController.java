package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = "/log")
	public void getlogin() {
		System.out.println("logged in successfully");
	}
	
}
