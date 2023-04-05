package com.outin.time.repositories;

import java.util.List;
import com.outin.time.models.OutInTime;

public interface OutTimeRepository 
{
	OutInTime getOutIn(int eid);
	void saveOuttime(OutInTime outin);
	List<OutInTime> getOutList();
	void updateList(OutInTime outin, int eid);
}
