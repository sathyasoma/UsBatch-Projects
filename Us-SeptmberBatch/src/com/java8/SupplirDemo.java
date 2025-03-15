package com.java8;

import java.util.Date;
import java.util.function.Supplier;

public class SupplirDemo {

	public static void main(String[] args) {
		
		 Supplier<Date> d=()->new Date();
		 System.out.println(d.get());
		 
		 // i want get some otp
		 
		 Supplier<String> s1=()->{
			
			 String otp="";
			 for(int i=0;i<6;i++)
			 {
				otp=otp+(int)(Math.random()*10); 
			 }
			 return otp;
		 };
		 
		 System.out.println(s1.get());
	}
}
