package com.outin.time.repositories.impl;
import java.util.List;

import org.hibernate.*;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.outin.time.models.OutInTime;
import com.outin.time.repositories.DatewiseReportRepository;

@Repository
public class DatewiseReportRepositoryImpl implements DatewiseReportRepository 
{
	private Session ses;
	
	@Autowired
	public DatewiseReportRepositoryImpl(SessionFactory factory)
	{
		ses=factory.openSession();
	}
	public List<OutInTime> getList(String date) 
	{
		Query<OutInTime> q=ses.createQuery("from EmployeeOutIn where date=:dt");
		q.setParameter("dt",date);
		return q.list();
	}
	
}
