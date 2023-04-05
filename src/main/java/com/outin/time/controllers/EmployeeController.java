package com.outin.time.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.outin.time.models.Employee;
import com.outin.time.services.EmployeeService;

@Controller
public class EmployeeController 
{
	@Autowired
	private EmployeeService service;
	
	@RequestMapping("employee/add")
	public String getInsertEmployeeView()
	{
		return "employee/insert";
	}
	@RequestMapping("employee/save-record")
	public String saveEmployeeRecord(Employee emp)
	{
		service.saveRecord(emp);
		return "employee/save";
	}
}
