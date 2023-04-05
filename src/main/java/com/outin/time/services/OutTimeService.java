package com.outin.time.services;

import java.util.List;
import com.outin.time.models.OutInTime;

public interface OutTimeService 
{
	OutInTime getOutInTime(int eid);
	void recordOuttime(OutInTime outin);
	List<OutInTime> getOutList();
	void updateList(int eid, int oeid);
}
