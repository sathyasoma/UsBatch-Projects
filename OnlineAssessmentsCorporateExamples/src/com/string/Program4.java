package com.string;

import java.util.Scanner;

//wriate a javaprogram to reverse a string

public class Program4 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the input String : ");
		String input= sc.nextLine();
		System.out.println("input :"+input);
		
		String reversString= new String(); //6
		
		for(int i=input.length()-1;i>=0;i--) {
			reversString +=input.charAt(i);
		}
		System.out.println("OUtput :"+reversString);
		sc.close();
	}
}
