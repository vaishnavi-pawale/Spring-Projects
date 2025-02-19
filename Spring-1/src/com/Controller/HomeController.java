package com.Controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Entity.Student;

public class HomeController {

	public static void main(String[] args) {

		// there are two containers in the Spring core
		// 1. core container -> BeanFactory
		
		// bean factory is deprecated. (i.e. it is no longer in use)

//		Resource resource = new ClassPathResource("beans.xml");
//
//		BeanFactory bf = new XmlBeanFactory(resource);
//
//		Student student = (Student) bf.getBean("stu");
//
//		student.studentDetails();

		// 2. J2EE container -> Application context.

	 	ApplicationContext apc = new ClassPathXmlApplicationContext("beans.xml");

		Student bean = apc.getBean("stu", Student.class);
		
		bean.studentDetails();
	}
}
