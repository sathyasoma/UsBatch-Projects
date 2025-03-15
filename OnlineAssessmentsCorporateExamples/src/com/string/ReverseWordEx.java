package com.string;

import java.util.Scanner;

// writa a java prohgram How to Reverse a String in Java Word by Word
public class ReverseWordEx {
	
	public static String reverseString(String s) {
		if (s.isEmpty()) // checks the string if empty
			return s;
		return reverseString(s.substring(1)) + s.charAt(0); // recursively called function
	}

	public static void main(String[] args) {
		String str;
		System.out.println("Enter a string: ");
		Scanner scanner = new Scanner(System.in);
		str = scanner.nextLine();
		scanner.close(); // closes the input stream
		String reversed = reverseString(str);
		System.out.println("The reversed string is: " + reversed);
	}

}
