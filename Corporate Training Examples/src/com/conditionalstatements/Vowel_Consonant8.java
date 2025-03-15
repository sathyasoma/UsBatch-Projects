package com.conditionalstatements;

import java.util.Scanner;

//Write a program to input any alphabet and check whether it is vowel or consonant

public class Vowel_Consonant8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Character :");
		char ch = input.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println("This is a Vowel");
		} else {
			System.out.println("This is a Consonant");
		}
	}
}
