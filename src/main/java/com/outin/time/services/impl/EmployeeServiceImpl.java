package com.outin.time.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.outin.time.models.Employee;
import com.outin.time.repositories.EmployeeRepository;
import com.outin.time.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService 
{
	@Autowired
	private EmployeeRepository repo;

	public void saveRecord(Employee emp) 
	{
		repo.saveEmployee(emp);
	}
	public List<Employee> getEmployeeList() 
	{
		return repo.getList();
	}
}
