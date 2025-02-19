package com.ServiceDAO;
 
import java.util.List;

import com.Entity.Employee;

public interface ClassDAO {

	public List<Employee> addEmployeeInDAO(Employee emp);
	
	public List<Employee> getEmployeesFromDao();
}
