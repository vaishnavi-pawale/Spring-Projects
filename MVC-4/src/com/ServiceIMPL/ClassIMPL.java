package com.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.Employee;
import com.Service.ClassService;
import com.ServiceDAO.ClassDAO;

@Service
public class ClassIMPL implements ClassService{

	@Autowired
	private ClassDAO clsdao;
	
	
	
	@Override
	public List<Employee> addEmployee(Employee emp) {
		System.out.println("I am in service layer");
		return clsdao.addEmployeeInDAO(emp);
	}



	@Override
	public List<Employee> getEmployee() {
		
		return clsdao.getEmployeesFromDao();
	}

}
