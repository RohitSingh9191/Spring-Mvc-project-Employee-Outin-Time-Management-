package com.outin.time.services.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.outin.time.models.Employee;
import com.outin.time.models.OutInTime;
import com.outin.time.repositories.InTimeRepository;
import com.outin.time.services.InTimeService;

@Service
public class InTimeServiceImpl implements InTimeService 
{
	@Autowired private InTimeRepository repo;

	public List<Employee> getOutList() 
	{
		return repo.getOutEmployeeList();
	}
	public void recordIntime(int eid) 
	{
		OutInTime outin=repo.getInRecord(eid);
		repo.updateIntime(outin);
	}
	public List<OutInTime> getInList() 
	{
		return repo.getInList();
	}
	public void updateInList(int eid, int oeid, String intime) 
	{
		OutInTime outino=repo.getEmpInRecord(oeid,intime);
		OutInTime outinn=repo.getOutIn(eid);
		repo.updateInList(outino,outinn);
	}
}
