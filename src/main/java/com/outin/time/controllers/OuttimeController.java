package com.outin.time.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.outin.time.models.Employee;
import com.outin.time.models.OutInTime;
import com.outin.time.services.EmployeeService;
import com.outin.time.services.OutTimeService;

@Controller
public class OuttimeController 
{
	@Autowired private EmployeeService eservice;
	@Autowired private OutTimeService service;
	
	@RequestMapping("employee/outtime")
	public String getOuttimeView(Model model)
	{
		List<Employee> list=eservice.getEmployeeList();
		model.addAttribute("elist",list);
		return "outtime/employee-list";
	}
	@RequestMapping("employee/save-outtime")
	public String saveOuttime(OutInTime outin,Model model)
	{
		OutInTime oit=service.getOutInTime(outin.getEid());
		if(oit!=null)
		{
			return "outtime/save-outtime-fail";	
		}
		service.recordOuttime(outin);
		return "outtime/save-outtime-success";
	}
	@RequestMapping("employee/out-list")
	public String getOuttimeList(Model model)
	{
		List<OutInTime> list=service.getOutList();
		model.addAttribute("elist",list);
		return "outtime/employee-out-list";
	}
	@RequestMapping("employee/edit-list")
	public String getEditListView(int eid,Model model)
	{
		List<Employee> list=eservice.getEmployeeList();
		model.addAttribute("elist",list);
		model.addAttribute("eid",eid);
		return "outtime/employee-list-edit";
	}
	@RequestMapping("employee/update-list")
	public String updateList(int eid,int oeid,Model model)
	{
		service.updateList(eid,oeid);
		return "redirect:out-list";
	}
}
