package com.loopingstatements;

import java.util.Scanner;

//write a program to Check Whether a Given Number is Prime or Not
public class Prime_Numbe18 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);        
		System.out.print("Enter the Number :");
		int num = input.nextInt(); 
		int i, count = 0;
		for(i=2; i<num; i++)
		{
			if(num%i == 0)
			{
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println("This is a Prime Number.");
		else
			System.out.println("This is not a Prime Number.");
	}
}
