package com.string;

import java.util.Scanner;

//wriate a javaprogram to reverse each word of a given string

public class Program6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the input String : ");
		String input = sc.nextLine();
		System.out.println("input :" + input);
		String[] words = input.split(" ");

		String outPutString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reversWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reversWord += word.charAt(j);

			}
			outPutString += reversWord + " ";
		}
		System.out.println("Output :" + outPutString);

	}
}
