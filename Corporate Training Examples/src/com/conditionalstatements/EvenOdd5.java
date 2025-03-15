package com.conditionalstatements;

import java.util.Scanner;

//Write a program to check whether a number is even or odd

public class EvenOdd5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number  : ");
		int num = input.nextInt();
		if (num % 2 == 0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
	}
}
