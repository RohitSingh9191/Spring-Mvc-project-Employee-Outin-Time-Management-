package com.outin.time.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.outin.time.models.Employee;
import com.outin.time.models.OutInTime;
import com.outin.time.services.InTimeService;

@Controller
public class IntimeController 
{
	@Autowired private InTimeService service;
	
	@RequestMapping("employee/intime")
	public String getIntimeView(Model model)
	{
		List<Employee> list=service.getOutList();
		model.addAttribute("elist",list);
		return "intime/employee-list";
	}
	@RequestMapping("employee/save-intime")
	public String saveIntime(int eid,Model model)
	{
		service.recordIntime(eid);
		return "intime/save-intime-success";
	}
	@RequestMapping("employee/in-list")
	public String getInList(Model model)
	{
		List<OutInTime> list=service.getInList();
		model.addAttribute("elist",list);
		return "intime/employee-in-list";
	}
	@RequestMapping("employee/edit-inlist")
	public String getEditListView(int eid,String time,Model model)
	{
		List<Employee> list=service.getOutList();
		model.addAttribute("elist",list);
		model.addAttribute("eid",eid);
		model.addAttribute("time",time);
		return "intime/employee-list-edit";
	}
	@RequestMapping("employee/update-inlist")
	public String updateInList(int eid,int oeid,String intime,Model model)
	{
		service.updateInList(eid,oeid,intime);
		return "redirect:intime";
	}
}
