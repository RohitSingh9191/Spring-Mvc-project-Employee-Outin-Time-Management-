package com.outin.time.repositories.impl;

import java.util.List;

import org.hibernate.*;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.outin.time.models.Employee;
import com.outin.time.repositories.EmployeeRepository;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository 
{
	private Session ses;
	private Transaction t;
	
	@Autowired
	public EmployeeRepositoryImpl(SessionFactory factory)
	{
		ses=factory.openSession();
		t=ses.getTransaction();
	}
	public void saveEmployee(Employee emp) 
	{
		t.begin();
		ses.save(emp);
		t.commit();
	}
	public List<Employee> getList() 
	{
		Query<Employee> q=ses.createQuery("from Employee");
		List<Employee> elist=q.list();
		return elist;
	}
}
