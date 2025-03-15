package com.java8;

import java.time.LocalDate;
import java.time.Period;

public class YearDemo {

	public static void main(String[] args) {
		
		LocalDate bdy= LocalDate.of(1994, 06, 04);
		LocalDate tdy= LocalDate.now();
		
		Period p=Period.between(tdy,bdy);
		
		System.out.println("age is "+p.getYears()+":"+p.getMonths()+":"+p.getDays());
	}
}
