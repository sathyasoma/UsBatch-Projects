package com.string;

import java.util.Scanner;

//wriate a javaprogram to count the number of charecter in a string

public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the input String : ");
		String input= sc.nextLine();
		System.out.println("input :"+input);
		System.out.println("output :"+input.length());
		sc.close();
	}
}
