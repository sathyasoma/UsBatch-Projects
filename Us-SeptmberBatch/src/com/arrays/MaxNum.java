package com.arrays;

public class MaxNum {

	public static void main(String[] args) {
		
		
		int[] numbers= {10,25,3,45,78,5};//6-1:5
		
		/*
		int largest=numbers[0];
		
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]>largest) 
			{
				largest=numbers[i];
			}
		}
		System.out.println("LARGEST VALUES IS :"+largest);
		
		*/
	
		/*
		for(int i=numbers.length-1;i>=0;i--)
		{
			System.out.print(numbers[i]+" ");
		}
		*/
		
		int sum=0;
		
		for(int nums:numbers)
		{
			sum=sum+nums;
		}
		System.out.println("sum of array is:"+sum);
	}
}
