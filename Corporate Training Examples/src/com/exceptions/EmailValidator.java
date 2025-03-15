package com.exceptions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}
public class EmailValidator {
	private static final String EMAIL_PATTERN =
	        "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
	    
	    public static void validateEmail(String email) throws InvalidEmailException {
	        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
	        Matcher matcher = pattern.matcher(email);
	        
	        if (!matcher.matches()) {
	            throw new InvalidEmailException("Invalid email format: " + email);
	        }
	    }
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter your email: ");
	        String email = scanner.nextLine();
	        
	        try {
	            validateEmail(email);
	            System.out.println("Email is valid.");
	        } catch (InvalidEmailException e) {
	            System.out.println("InvalidEmailException: " + e.getMessage());
	        }
	        
	        scanner.close();
	    }

}
