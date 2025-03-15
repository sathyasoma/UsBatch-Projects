package com.loopingstatements;

import java.util.Scanner;

//Write a program to find sum of all odd numbers between 1 to n
public class Sum_Odd_Number12 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Number of Limit : ");
		int l =input.nextInt();
		int sum = 0;
		for(int s=1;s<=l;s++)
		{
			if(s%2==1)
				sum = sum + s;
 
		}
		System.out.println("Sum of Odd Numbers :"+sum);
	}
}//print ascci charecter :ascii:255  1  to 255
// 65-A  97-a
