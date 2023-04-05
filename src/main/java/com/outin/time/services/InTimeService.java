package com.outin.time.services;

import java.util.List;

import com.outin.time.models.Employee;
import com.outin.time.models.OutInTime;

public interface InTimeService 
{
	List<Employee> getOutList();
	void recordIntime(int eid);
	List<OutInTime> getInList();
	void updateInList(int eid, int oeid, String intime);
}
