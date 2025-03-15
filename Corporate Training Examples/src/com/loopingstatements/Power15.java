package com.loopingstatements;

import java.util.Scanner;

//Write a program to find the value of one number raised to the power of another
public class Power15 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);        
		System.out.print("Enter the Base Number :");
		int base = input.nextInt();        
		System.out.print("Enter the Power Number :");
		int power = input.nextInt();
		int result = 1;
		for(int i = 1; i <= power; i++)
		{
			result *= base;
		}
 
		System.out.println("Result: "+ result);
	}
}
