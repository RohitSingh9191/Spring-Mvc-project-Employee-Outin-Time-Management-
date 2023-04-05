package com.outin.time.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.outin.time.repositories.DatewiseReportRepository;
import com.outin.time.services.DatewiseReportService;

@Service
public class DatewiseReportServiceImpl implements DatewiseReportService 
{
	@Autowired
	private DatewiseReportRepository repo;
}
