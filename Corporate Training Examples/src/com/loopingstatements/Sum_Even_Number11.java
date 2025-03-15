package com.loopingstatements;

import java.util.Scanner;

//Write a program to find sum of all even numbers between 1 to n
public class Sum_Even_Number11 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Number of Limit : ");
		int l =input.nextInt();
		int sum = 0;
		for(int s=1;s<=l;s++)
		{
			if(s%2==0)
				sum = sum + s;
 
		}
		System.out.println("Sum of Even Numbers :"+sum);
	}
}
