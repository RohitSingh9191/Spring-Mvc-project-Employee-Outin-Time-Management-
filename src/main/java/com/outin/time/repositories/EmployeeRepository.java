package com.outin.time.repositories;

import java.util.List;

import com.outin.time.models.Employee;

public interface EmployeeRepository 
{
	void saveEmployee(Employee emp);
	List<Employee> getList();
}
