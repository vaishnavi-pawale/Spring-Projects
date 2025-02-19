package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

 //stereotype annotation-> it will provide layers

@Controller
public class HomeController {

	@RequestMapping(value = "/log")
	public void getLoginDetails() {
		
		System.out.println("Successful");

		//return "success";//returns view file name
	}
	
}
