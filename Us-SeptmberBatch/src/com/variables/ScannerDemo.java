package com.variables;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);// cntl+shift +o

		System.out.println("Enter User name");
		String uname = sc.next(); // sathya
		System.out.println("Enter Student Marks");
		byte marks = sc.nextByte();
		System.out.println("Enter Student fees");
		short fees = sc.nextShort();
		System.out.println("Student distance to home");
		int time = sc.nextInt();
		System.out.println(" Employee salary is ");
		float salary = sc.nextFloat();
		System.out.println("Employee bonus is ");
		double bonus = sc.nextDouble();
		System.out.println("Student is sleeping ?");
		boolean sleep = sc.nextBoolean();
		
	
		System.out.println("****Person Detailes are:***");
		System.out.println("name of person:"+uname);
		System.out.println("name of person:"+marks);
		System.out.println("name of person:"+fees);
		System.out.println("name of person:"+time);
		System.out.println("name of person:"+salary);
		System.out.println("name of person:"+bonus);
		System.out.println("name of person:"+sleep);
		
	}
}
