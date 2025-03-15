package com.java8;

import java.time.Year;
import java.util.Scanner;

public class LeapDemo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println(" PLEASE Enter Year");
		int n= sc.nextInt();
		
		Year y= Year.of(n);//passing year value
		
		if(y.isLeap())
		{
			System.out.println("is leap year"+n);
		}
		else {
			System.out.println("its nota leap year"+n);
		}
		
		
	}
}
