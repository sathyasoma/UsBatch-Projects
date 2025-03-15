package com.exceptions;

import java.util.Scanner;

class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}
public class UsernameValidator {
	   private static final int MIN_LENGTH = 5;
	    private static final int MAX_LENGTH = 15;
	    private static final String ALLOWED_CHARACTERS = "^[a-zA-Z0-9_]+$";

	    public static void validateUsername(String username) throws InvalidUsernameException {
	        if (username.length() < MIN_LENGTH || username.length() > MAX_LENGTH) {
	            throw new InvalidUsernameException("Username must be between " + MIN_LENGTH + " and " + MAX_LENGTH + " characters.");
	        }
	        if (!username.matches(ALLOWED_CHARACTERS)) {
	            throw new InvalidUsernameException("Username contains invalid characters. Only alphanumeric characters and underscores are allowed.");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a username: ");
	        String username = scanner.nextLine();

	        try {
	            validateUsername(username);
	            System.out.println("Username is valid.");
	        } catch (InvalidUsernameException e) {
	            System.out.println("InvalidUsernameException: " + e.getMessage());
	        }

	        scanner.close();
	    }
}
