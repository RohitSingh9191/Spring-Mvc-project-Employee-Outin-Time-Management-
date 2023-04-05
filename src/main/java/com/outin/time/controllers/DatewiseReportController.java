package com.outin.time.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.outin.time.services.DatewiseReportService;

@Controller
public class DatewiseReportController 
{
	@Autowired
	private DatewiseReportService service;
	
	@RequestMapping("report/date")
	public String getDateSelectionView()
	{
		return "datewise-report/choose-date";
	}
	@RequestMapping("report/current-date")
	public String getCurrentDateReportView(Model model)
	{
		return "datewise-report/current-date";
	}
}
