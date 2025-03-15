package com.conditionalstatements;

import java.util.Scanner;

//Write a program to check whether a character is uppercase or lowercase alphabet

public class Upper_Lower10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Character :");
		char ch = input.next().charAt(0);
		if (ch >= 'a' && ch <= 'z') {
			System.out.println("This is a Lowercase Alphabet");
		} else {
			System.out.println("This is a Uppercase Alphabet");
		}
	}
}
