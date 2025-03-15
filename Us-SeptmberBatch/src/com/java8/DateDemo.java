package com.java8;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateDemo {

	public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		int dd=date.getDayOfMonth();
		int mm=date.getMonthValue();
		int yy=date.getYear();
		
		System.out.println("day is :"+dd+" month is :"+mm+" year is :"+yy);
		LocalTime time= LocalTime.now();
		System.out.println(time);
		
		int hh=time.getHour();
		int mn=time.getMinute();
		int s=time.getSecond();
		int ns=time.getNano();
		
		System.out.println(hh+":"+mn+":"+s+":"+ns);
	}
}
