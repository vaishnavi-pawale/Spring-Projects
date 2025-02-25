package com.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Entity.Company;
import com.Entity.Department;
import com.Entity.Employee;

public class HomeController {

	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("beans.xml");

		Employee bean = apc.getBean("emp", Employee.class);
		System.out.println(bean);

		Company bean2 = apc.getBean("cmp", Company.class);
		System.out.println(bean2);

		Department bean3 = apc.getBean("dept", Department.class);
		System.out.println(bean3);

	}
}
