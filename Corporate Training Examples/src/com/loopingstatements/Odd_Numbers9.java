package com.loopingstatements;

import java.util.Scanner;

//Write a program to print all odd number between 1 to 100
public class Odd_Numbers9 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Number of Limit : ");
		int l =input.nextInt();
		for(int s=1;s<=l;s++)
		{
			if(s%2==1)
				System.out.println(s);
		}
	}
}
