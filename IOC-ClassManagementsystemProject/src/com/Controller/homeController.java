package com.Controller;

import java.beans.Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Entity.Student;

public class homeController {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

		Student bean = applicationContext.getBean("stu", Student.class);

		System.out.println(bean);

	}

}
