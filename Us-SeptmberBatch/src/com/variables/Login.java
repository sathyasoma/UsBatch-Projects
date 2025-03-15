package com.variables;

import java.util.Scanner;

public class Login {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter username");
		String uname=sc.next();//keerthi
		System.out.println("Enter pASSWORD");
		String pwd=sc.next();
		
		if(uname.equals("keerthi") && pwd.equals("keerthi123"))
		{
			
			System.out.println("login success...");
		}
		else {
			System.out.println("login denied,,,,,,");
		}
		
	}
}
