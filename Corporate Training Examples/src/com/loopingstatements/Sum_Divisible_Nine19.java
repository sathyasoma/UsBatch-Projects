package com.loopingstatements;
//Write a program to find number and sum of all integer between 100 and 200 which are divisible by 9
public class Sum_Divisible_Nine19 {
	public static void main(String[] args)
	{
		int i, sum=0;
		System.out.println("Numbers between 100 and 200, divisible by 9 : \n");
		for(i=101;i<200;i++)
		{
			if(i%9==0)
			{
				System.out.println(i);
				sum+=i;
			}
		}
	}
}
