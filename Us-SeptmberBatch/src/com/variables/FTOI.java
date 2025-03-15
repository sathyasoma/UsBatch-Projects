package com.variables;

import java.util.Scanner;

public class FTOI {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter float value");
		float f= sc.nextFloat();
		
		int result=(int) f; //typecasting
		
		System.out.println(result);
	}
}
