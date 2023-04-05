package com.outin.time.services.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.outin.time.models.OutInTime;
import com.outin.time.repositories.OutTimeRepository;
import com.outin.time.services.OutTimeService;
import com.outin.time.util.TimeDate;

@Service
public class OutTimeServiceImpl implements OutTimeService 
{
	@Autowired private OutTimeRepository repo;

	public OutInTime getOutInTime(int eid) 
	{
		return repo.getOutIn(eid);
	}
	public void recordOuttime(OutInTime outin) 
	{
		outin.setOuttime(TimeDate.getCurrentTime());
		outin.setIntime("Not in yet");
		outin.setTotaltime("Not apllicable");
		outin.setDate(LocalDate.now());
		repo.saveOuttime(outin);
	}
	public List<OutInTime> getOutList() 
	{
		return repo.getOutList();
	}
	public void updateList(int eid, int oeid) 
	{
		OutInTime outin=repo.getOutIn(oeid);
		repo.updateList(outin,eid);
	}
}
