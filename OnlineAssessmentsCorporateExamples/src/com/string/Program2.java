package com.string;

import java.util.Scanner;

//wriate a javaprogram to count the number of words in a string

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the input String : ");
		String input= sc.nextLine();
		System.out.println("input :"+input);
		String[] words=input.split(" ");
		System.out.println("Output :"+words.length);
		sc.close();
		
	}
}
