package com.Service;

import java.util.List;

import com.Entity.Employee;

public interface ClassService {

	public List<Employee> addEmployee(Employee emp);

	public List<Employee> getEmployee();
	
}
