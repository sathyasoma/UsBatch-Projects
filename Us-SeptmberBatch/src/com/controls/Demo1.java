package com.controls;

import java.util.Scanner;

public class Demo1 {
public static void main(String[] args) {
	
	int marks;
	Scanner sc= new Scanner(System.in);
	
	marks=sc.nextInt();
	
	if(marks>=85)
	{
		System.out.println("A");
	}
	else if(marks>=75)
	{
		System.out.println("B");
	}
	else if(marks>=65)
	{
		System.out.println("C");
	}
	else {
		System.out.println("D");
	}
	
}
}
