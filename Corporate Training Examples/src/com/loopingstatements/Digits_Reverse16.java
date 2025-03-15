package com.loopingstatements;

import java.util.Scanner;

//write a program to reverse the given Digits
public class Digits_Reverse16 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);        
		System.out.print("Enter the Digits :");
		int num = input.nextInt(); 
		int a = num;
		int rev = 0;
		int rem = 0;        
		while(num>0)
		{
			rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		System.out.println("Given Digits :" + a);
		System.out.println("Reverse Digits :" + rev);
	}
}

/*
 * Enter the Digits :5678
Given Digits :5678
Reverse Digits :8765
 * */


