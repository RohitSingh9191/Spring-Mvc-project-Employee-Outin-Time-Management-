package com.outin.time.repositories.impl;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.*;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.outin.time.models.Employee;
import com.outin.time.models.OutInTime;
import com.outin.time.repositories.InTimeRepository;
import com.outin.time.repositories.OutTimeRepository;
import com.outin.time.util.TimeDate;

@Repository
public class InTimeRepositoryImpl implements InTimeRepository 
{
	private Session ses;
	private Transaction t;
	
	@Autowired
	public InTimeRepositoryImpl(SessionFactory fact)
	{
		ses=fact.openSession();
		t=ses.getTransaction();
	}
	public List<Employee> getOutEmployeeList() 
	{
		Query<Employee> q=ses.createQuery("select e from Employee e join OutInTime oi on e.eid=oi.eid where oi.date=:dt and oi.intime='Not in yet'");
		q.setParameter("dt",LocalDate.now());
		List<Employee> elist=q.list();
		return elist;
	}
	public OutInTime getInRecord(int eid) 
	{
		Query<OutInTime> q=ses.createQuery("from OutInTime where eid=:arg1 and date=:arg2 and intime='Not in yet'");
		q.setParameter("arg1",eid);
		q.setParameter("arg2",LocalDate.now());
		OutInTime outin=q.uniqueResult();
		return outin;
	}
	public void updateIntime(OutInTime outin) 
	{
		String intime=TimeDate.getCurrentTime();
		String totaltime=TimeDate.getTotalTime(intime,outin.getOuttime());
		t.begin();
		outin.setIntime(intime);
		outin.setTotaltime(totaltime);
		t.commit();
	}
	public List<OutInTime> getInList() 
	{
		Query<OutInTime> q=ses.createQuery("from OutInTime where date=:dt and intime!='Not in yet'");
		q.setParameter("dt",LocalDate.now());
		List<OutInTime> elist=q.list();
		return elist;
	}
	public OutInTime getEmpInRecord(int oeid, String intime)
	{
		Query<OutInTime> q=ses.createQuery("from OutInTime where eid=:arg1 and date=:arg2 and intime=:arg3");
		q.setParameter("arg1",oeid);
		q.setParameter("arg2",LocalDate.now());
		q.setParameter("arg3",intime);
		OutInTime outin=q.uniqueResult();
		return outin;
	}
	public void updateInList(OutInTime outino, OutInTime outinn) 
	{
		t.begin();
		outinn.setIntime(outino.getIntime());
		outinn.setTotaltime(outino.getTotaltime());
		outino.setIntime("Not in yet");
		outino.setTotaltime("Not applicable");
		t.commit();
	}
	public OutInTime getOutIn(int eid)
	{
		return null;
	}
}
