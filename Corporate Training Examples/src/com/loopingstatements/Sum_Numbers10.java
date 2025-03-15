package com.loopingstatements;

import java.util.Scanner;

//Write a program to find sum of all natural numbers between 1 to n
public class Sum_Numbers10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Number of Limit : ");
		int l = input.nextInt();//90
		int sum = 0;
		for (int s = 1; s <= l; s++) {
			sum = sum + s;//2+2

		}
		System.out.println("Sum of Numbers :" + sum);
	}
}
