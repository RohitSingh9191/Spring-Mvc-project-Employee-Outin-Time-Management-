package com.outin.time.repositories;

import java.util.List;

import com.outin.time.models.Employee;
import com.outin.time.models.OutInTime;

public interface InTimeRepository 
{
	List<Employee> getOutEmployeeList();
	OutInTime getInRecord(int eid);
	void updateIntime(OutInTime outin);
	List<OutInTime> getInList();
	OutInTime getEmpInRecord(int oeid, String intime);
	void updateInList(OutInTime outino, OutInTime outinn);
	OutInTime getOutIn(int eid);
}
