package com.exceptions;

import java.util.Scanner;

class ExceedMaxAttemptsException extends Exception {
    public ExceedMaxAttemptsException(String message) {
        super(message);
    }
}
public class LoginManager {
	 private static final int MAX_ATTEMPTS = 3;
	    private static final String CORRECT_USERNAME = "user";
	    private static final String CORRECT_PASSWORD = "password";

	    public static void login() throws ExceedMaxAttemptsException {
	        Scanner scanner = new Scanner(System.in);
	        int attempts = 0;

	        while (attempts < MAX_ATTEMPTS) {
	            System.out.print("Enter username: ");
	            String username = scanner.nextLine();

	            System.out.print("Enter password: ");
	            String password = scanner.nextLine();

	            if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
	                System.out.println("Login successful.");
	                return;
	            } else {
	                System.out.println("Invalid username or password. Try again.");
	                attempts++;
	            }
	        }

	        throw new ExceedMaxAttemptsException("Exceeded maximum login attempts.");
	    }

	    public static void main(String[] args) {
	        try {
	            login();
	        } catch (ExceedMaxAttemptsException e) {
	            System.out.println("ExceedMaxAttemptsException: " + e.getMessage());
	        }
	    }
}
