package com.conditionalstatements;

import java.util.Scanner;

//Write a program to check whether a number is negative, positive or zero
public class Negative_Positive3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number  : ");
		int num = input.nextInt();
		if (num > 0)
			System.out.println("Positive Number");
		else if (num < 0)
			System.out.println("Negative Number");
		else
			System.out.println("Zero");
	}
}
