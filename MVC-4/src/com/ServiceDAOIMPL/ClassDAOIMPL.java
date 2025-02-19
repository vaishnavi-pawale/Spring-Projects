package com.ServiceDAOIMPL;



import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Entity.Employee;
import com.ServiceDAO.ClassDAO;

@Repository
public class ClassDAOIMPL implements ClassDAO {

	@Autowired
	private SessionFactory sf;

	@Override
	public List<Employee> addEmployeeInDAO(Employee emp) {

		System.out.println(" i am in dao layer");
		
		Session s = sf.openSession();
		s.save(emp);
		s.beginTransaction().commit();
		
		System.out.println("Employee Added");
	
		Query query = s.createQuery("from Employee");
		
		return query.getResultList();
		

	}

	@Override
	public List<Employee> getEmployeesFromDao() {
		Session s = sf.openSession();
		Query query = s.createQuery("from Employee");
		List listOfEmp = query.getResultList();
		return listOfEmp;
	}

}
