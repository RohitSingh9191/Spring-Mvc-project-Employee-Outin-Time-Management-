package com.outin.time.util;

import java.time.LocalTime;
public class TimeDate 
{
	public static String getCurrentTime()
	{
		LocalTime lt=LocalTime.now();
		String time=lt.getHour()+":"+lt.getMinute()+":"+lt.getSecond();
		return time;
	}
	public static String getTotalTime(String intime,String outtime)
	{
		int intimesec=getTimeInSeconds(intime);
		int outtimesec=getTimeInSeconds(outtime);
		int totaltime=intimesec-outtimesec;
		String total=totaltime/60+" min "+totaltime%60+" sec";
		return total;
	}
	private static int getTimeInSeconds(String time)
	{
		String[] x=time.split(":");
		int total=Integer.parseInt(x[0])*60*60+Integer.parseInt(x[1])*60+Integer.parseInt(x[2]);
		return total;
	}
}
