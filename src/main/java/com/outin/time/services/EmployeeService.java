package com.outin.time.services;

import java.util.List;

import com.outin.time.models.Employee;

public interface EmployeeService 
{
	void saveRecord(Employee emp);
	List<Employee> getEmployeeList();
}
