package com.outin.time.repositories;

import java.util.List;
import com.outin.time.models.OutInTime;
public interface DatewiseReportRepository 
{
	List<OutInTime> getList(String currentDate);
}
