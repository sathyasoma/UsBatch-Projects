package com.loopingstatements;

import java.util.Scanner;

//Write a program to print all even numbers between 1 to 100
public class Even_Numbers8 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Number of Limit : ");
		int l =input.nextInt();
		for(int s=1;s<=l;s++)
		{
			if(s%2==0)
				System.out.println(s);
		}
	}
}
