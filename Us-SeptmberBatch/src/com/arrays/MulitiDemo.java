package com.arrays;

public class MulitiDemo {
public static void main(String[] args) {
	
	int marks[][]= {{23,45,67},{78,89,67},{23,45,89}};
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(marks[i][j]+" ");
		}
		System.out.println();
	}
	
}
}
