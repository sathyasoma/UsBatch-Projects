package com.controls;

import java.util.Scanner;

public class Vow {
public static void main(String[] args) {
	//5v  21 con
	Scanner sc= new Scanner(System.in);
	System.out.println("enter  charecter");
	char ch= sc.next().charAt(0);//sathya
	
	if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
		System.out.println("it a vowel");
	}
	else {
		System.out.println("consonents");
	}
	
	
}
}
