package com.arrays;

import java.util.Scanner;

//Write a program to array elements to print sum of Negative Numbers
public class Array_Sum_Negative21 {
	public static void main(String[] args)
	{   
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the Array Limit :");
		int l =input.nextInt();
		int [] a =new int[l];
		int sum = 0;
		for(int i=0;i<l;i++)
		{
			System.out.printf("Element of a[%d] :",i);
			a[i]=input.nextInt();
		}
		for(int p:a)
		{
			if(p<0)
				sum = sum + p;
		}		
		System.out.println("Sum of Negative Array Elements : "+sum);
    }
}
