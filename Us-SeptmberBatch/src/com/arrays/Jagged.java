package com.arrays;

public class Jagged {
public static void main(String[] args) {
	
	
	int marks[][]= {{23,78,14},{90,67},{78,56,34}};
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<marks[i].length;j++)
		{
			System.out.print(marks[i][j]+" ");
		}
		System.out.println();
	}
}
}
