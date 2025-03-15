package com.conditionalstatements;

import java.util.Scanner;

//Write a program to input all sides of a triangle and check whether triangle is valid or not

public class All_Side_Triangle15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Three Sides of Triangle :");
		int side1 = input.nextInt();
		int side2 = input.nextInt();
		int side3 = input.nextInt();
		if ((side1 + side2) > side3)
			if ((side2 + side3) > side1)
				if ((side1 + side3) > side2)
					System.out.println("Triangle is valid.");
				else
					System.out.println("Triangle is not valid.");
			else
				System.out.println("Triangle is not valid.");
		else
			System.out.println("Triangle is not valid.");
	}
}
