package com.loopingstatements;

import java.util.Scanner;

//Write Java program to Print Fibonacci Series
public class Fabonacci_Series21 {
	public static void main(String[] args)
	{
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Length of Fibonacci Series : ");
		n = input.nextInt();
 
		int[] num = new int[n];
		num[0] = 0;
		num[1] = 1;
 
		for (int i = 2; i < n; i++)
		{
			num[i] = num[i - 1] + num[i - 2];//sum of last two numbers
		}
 
		System.out.print("Fibonacci Series : ");
		for (int i = 0; i < n; i++)
		{
			System.out.print(num[i] + " ");
		}
	}
}
