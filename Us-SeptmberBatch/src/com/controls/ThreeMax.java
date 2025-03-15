package com.controls;

import java.util.Scanner;

public class ThreeMax {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("enter first number");
	int num1=sc.nextInt();
	System.out.println("enter second number");
	int num2=sc.nextInt();
	System.out.println("enter third number");
	int num3=sc.nextInt();
	
	
	if(num1>num2 && num1>num3)
	{
		System.out.println("maximum num is :"+num1);
	}
	else if(num1<num2 && num3<num2)
	{
		System.out.println("maximum num is :"+num2);
	}
	else {
		System.out.println("maximumnu is :"+num3);
	}
}
}
