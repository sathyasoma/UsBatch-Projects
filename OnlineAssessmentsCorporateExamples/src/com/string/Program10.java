package com.string;

import java.util.Arrays;
import java.util.Scanner;

//wriate a javaprogram to count the number of charecter in a string

public class Program10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the input String : ");
		String input = sc.nextLine();
		System.out.println("input :" + input);
		
		String[] words=input.split(" ");;
		String[] outputArr= new String[words.length/2];
		
		int index=0;
		for(int i=0;i<words.length;i++) {
			if(i%2!=0)
			{
				outputArr[index]=words[i];
				index++;
			}
		}
		
		System.out.println("Output :"+Arrays.toString(outputArr));
	}
}
