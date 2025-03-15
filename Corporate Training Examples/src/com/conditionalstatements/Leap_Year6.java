package com.conditionalstatements;

import java.util.Scanner;

//Write a program to check whether a year is leap year or not

public class Leap_Year6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Year :");
		int year = input.nextInt();
		boolean flag = false;
		if (year % 400 == 0)
			flag = true;
		else if (year % 100 == 0)
			flag = false;
		else if (year % 4 == 0)
			flag = true;
		else
			flag = false;

		if (flag) {
			System.out.println("Year " + year + " is a Leap Year");
		} else {
			System.out.println("Year " + year + " is not a Leap Year");
		}
	}
}
//7.check the given charecter is alphabet or not?
    //char c=sc.next().charAt(0);