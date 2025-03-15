package com.exceptions;

import java.sql.SQLException;

public class AgeValidator {
  
	public static void validateAge(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("You are not eligible for vote :" +age);
		}
		else {
			System.out.println("you are elegible for vote :"+age);
		}
	}
	public static void main(String[] args) throws InvalidAgeException {
		
		AgeValidator.validateAge(22);
		System.out.println("remaining 1000 lines of code");
	}
}
