package com.Controller;

import java.beans.Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Entity.Employee;

public class HomeController {

	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("beans.xml");

		Employee bean = apc.getBean("emp", Employee.class);

		bean.getEid();
	
	}

}
