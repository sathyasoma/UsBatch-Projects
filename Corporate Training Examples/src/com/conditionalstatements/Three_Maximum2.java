package com.conditionalstatements;

import java.util.Scanner;
//Write a program to find maximum between three numbers

public class Three_Maximum2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number 1 : ");
		int num1 = input.nextInt();
		System.out.print("Enter the Number 2 : ");
		int num2 = input.nextInt();
		System.out.print("Enter the Number 3 : ");
		int num3 = input.nextInt();
		if (num1 > num2 && num1 > num3)
			System.out.println("Maximum Number is " + num1);
		else if (num1 < num2 && num3 < num2)
			System.out.println("Maximum Number is " + num2);
		else
			System.out.println("Maximum Number is " + num3);
	}
}
