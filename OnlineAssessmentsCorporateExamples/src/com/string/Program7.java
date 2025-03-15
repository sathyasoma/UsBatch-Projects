package com.string;

import java.util.Scanner;

//wriate a java program to modify the string in the following pattern
//in:this is hello world   out: THIS si HELLO dlrow

public class Program7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the input String : ");
		String input = sc.nextLine();
		System.out.println("input :" + input);
		String[] words = input.split(" ");

		String outPutString = "";

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			
			if (i % 2 == 0)
				outPutString += word.toUpperCase();
			else
				outPutString += getReverseString(word);
			if (i != words.length - 1)
				outPutString += " ";
		}
		System.out.println("Output :" + outPutString);
		sc.close();
	}

	private static String getReverseString(String inputString) {
		String reverseString = "";
		for (int j = inputString.length() - 1; j >= 0; j--) {
			reverseString += inputString.charAt(j);

		}
		return reverseString;
	}
}
