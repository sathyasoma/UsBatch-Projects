package com.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DTDemo {

	public static void main(String[] args) {
		
		LocalDateTime ldt= LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDate ld= LocalDate.of(1994,06,04);//date 
		System.out.println(ld);
		
		System.out.println("after six months :"+ld.plusMonths(6));
		System.out.println("Before six months :"+ld.minusMonths(6));
		
	}
}
