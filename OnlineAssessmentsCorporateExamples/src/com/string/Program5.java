package com.string;

import java.util.Scanner;

//wriate a javaprogram to remove all starting and ending spaces from a string

public class Program5 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the input String : ");
		String input= sc.nextLine();
		System.out.println("input :"+input);
		
		System.out.println("Output :"+input.trim());
		sc.close();
	}
}
