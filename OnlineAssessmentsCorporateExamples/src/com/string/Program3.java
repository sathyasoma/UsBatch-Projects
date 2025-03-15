package com.string;

import java.util.Scanner;

//wriate a javaprogram to count the total number of occurences of a
//given charecter in a string


public class Program3 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the input String : ");
		String input= sc.nextLine();
		System.out.println("please enter the target charecter :");
		char targetchar=sc.next().charAt(0);
		System.out.println("input :"+input);
		System.out.println("Target Charecter :"+targetchar);
		
		
//		int count=0;
//		for(int i=0;i<input.length();i++) {	
//			if(input.charAt(i)==targetchar) 
//			count++;
//		}
		
		//another way
		
		
		char[] charecters=input.toCharArray();
		int count=0;
		for(int i=0;i<charecters.length;i++) {
			if(charecters[i]==targetchar)
				count++;
		}
			System.out.println("output :"+count);
			sc.close();
		
	}
}
