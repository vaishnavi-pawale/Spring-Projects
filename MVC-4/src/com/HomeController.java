package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Entity.Employee;
import com.Service.ClassService;

@Controller
public class HomeController {

	@Autowired
	private ClassService clss;

	private final static String username = "vaishnavi";
	private final static String PASSWORD = "123vaish";

	@RequestMapping(value = "/log")
	public String getMessage(@RequestParam("username") String un, @RequestParam("password") String ps, Model model) {

		List<Employee> employees = clss.getEmployee();

		System.out.println("username :-" + un);
		System.out.println("password :-" + ps);

		boolean flag = false;

		for (Employee employee : employees) {

			if (employee.getEname().equals(un) && ps.equals(PASSWORD)) {

				flag = true;
				break;
			}
		}

		if (flag) {
			model.addAttribute("msg", employees);
			return "success";
		} else {
			model.addAttribute("msg", "Invalid Username and password");
			return "login";

		}

	}

	@RequestMapping(value = "/reg")
	public String regiterEmployee(@ModelAttribute Employee emp, Model model) {

		List<Employee> lie = clss.addEmployee(emp);

		model.addAttribute("msg", lie);

		System.out.println(lie);

		System.out.println(emp);

		System.out.println("employee informtion");
		System.out.println(emp);

		if (emp != null) {
			return "login";
		} else {
			return "register";
		}
	}

}
