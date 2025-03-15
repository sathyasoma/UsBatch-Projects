package com.exceptions;

//class exetends with super class
public class InvalidAgeException extends Exception{
    
	//param consctrutor
	public InvalidAgeException(String message)
	{
		super(message);
	}
}
