package com.string;

import java.util.Scanner;

//WAP to find the first repeated and non-repeated charecter in the given string


public class Program9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the input String : ");
		String input = sc.nextLine();
		System.out.println("input :" + input);
		
		char firstRepeatedChar=' ';
		char firstNonRepeatedCahr=' ';
		
		for(int i=0;i<input.length();i++) {
			char tempChar=input.charAt(i);
			
			if(tempChar!=' ') {
				if(input.indexOf(tempChar)==input.lastIndexOf(tempChar))
				{
					if(firstNonRepeatedCahr==' ')
						 firstNonRepeatedCahr = tempChar;
				}
				else if(firstRepeatedChar==' ')
					firstRepeatedChar =tempChar;
				if(firstNonRepeatedCahr!= ' ' && firstRepeatedChar!=' ')
					break;
			}
		}
		
		System.out.println("Output :");
		System.out.println("first Repeated Char :"+firstRepeatedChar);
		System.out.println("first Non Repeated Cahr :"+firstNonRepeatedCahr);
	}
}
