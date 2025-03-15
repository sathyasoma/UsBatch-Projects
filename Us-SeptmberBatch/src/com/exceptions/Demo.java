package com.exceptions;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter First nUmber..");
		int fnum=sc.nextInt();
		System.out.println("Enter Second Number..");
		int snum=sc.nextInt();
		
		
		int result=fnum/snum;
		System.out.println("divsion of two number is :"+result);
		
		
		System.out.println("remaining 1000 lines of code");
	}
}
