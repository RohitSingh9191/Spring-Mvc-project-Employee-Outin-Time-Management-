package com.outin.time.repositories.impl;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.*;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.outin.time.models.Employee;
import com.outin.time.models.OutInTime;
import com.outin.time.repositories.OutTimeRepository;
import com.outin.time.util.TimeDate;

@Repository
public class OutTimeRepositoryImpl implements OutTimeRepository 
{
	private Session ses;
	private Transaction t;
	
	@Autowired
	public OutTimeRepositoryImpl(SessionFactory fact)
	{
		ses=fact.openSession();
		t=ses.getTransaction();
	}
	public OutInTime getOutIn(int eid) 
	{
		Query<OutInTime> q=ses.createQuery("from OutInTime where eid=:arg1 and date=:arg2 and intime='Not in yet'");
		q.setParameter("arg1",eid);
		q.setParameter("arg2",LocalDate.now());
		OutInTime outin=q.uniqueResult();
		return outin;
	}
	public void saveOuttime(OutInTime outin) 
	{
		t.begin();
		ses.save(outin);
		t.commit();
	}
	public List<OutInTime> getOutList() 
	{
		Query<OutInTime> q=ses.createQuery("from OutInTime where date=:dt and intime='Not in yet'");
		q.setParameter("dt",LocalDate.now());
		List<OutInTime> elist=q.list();
		return elist;
	}
	public void updateList(OutInTime outin,int eid) 
	{
		t.begin();
		outin.setEid(eid);
		t.commit();
	}
}
