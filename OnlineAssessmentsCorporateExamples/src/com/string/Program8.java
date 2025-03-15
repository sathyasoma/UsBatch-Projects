package com.string;

import java.util.Scanner;

//wriate a javaprogram to find the count of uppercase and lowercase digits and special chrs


public class Program8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the input String : ");
		String input = sc.nextLine();
		System.out.println("input :" + input);
		int uppercaseLetterCount=0;
		int lowerCaseLetterCount=0;
		int digitsCount=0;
		int specialCharsCount=0;
		
		char[] charecters=input.toCharArray();
		
		for(char ch:charecters) {
			if(Character.isUpperCase(ch))
				uppercaseLetterCount++;
			else if(Character.isLowerCase(ch))
				lowerCaseLetterCount++;
			else if(Character.isDigit(ch))
				digitsCount++;
			else
				specialCharsCount++;
		}	
		System.out.println("Output :");
		System.out.println("upper case Letter Count  :"+uppercaseLetterCount);
		System.out.println("lower Case Letter Count  :"+lowerCaseLetterCount);
		System.out.println(" digitsCountterCount  :"+digitsCount);
		System.out.println("special Chars Count  :"+specialCharsCount);
		
		
	}
}
