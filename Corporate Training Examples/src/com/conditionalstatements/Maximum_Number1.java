package com.conditionalstatements;

import java.util.Scanner;

//Write a program to find maximum between two numbers

public class Maximum_Number1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number1 : ");
		int num1 = input.nextInt();
		System.out.print("Enter the Number2 : ");
		int num2 = input.nextInt();
		if (num1 > num2)
			System.out.println("Maximum Number is " + num1);
		else if (num1 < num2)
			System.out.println("Maximum Number is " + num2);
		else
			System.out.println("Both are Equal " + num1);
	}
}
