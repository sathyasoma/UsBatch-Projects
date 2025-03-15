package com.variables;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("ENTER FIRST NUMBER");
		           int fnum= sc.nextInt();
		System.out.println("Enter second number");
		  int snum=sc.nextInt();
		  
		  int result=fnum*snum;
		  
		  System.out.println("multi of two nums is:"+result);
	}
}
