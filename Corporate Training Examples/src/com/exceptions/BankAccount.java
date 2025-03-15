package com.exceptions;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);//Exception.getMessage();
    }
}
public class BankAccount {
	  private double balance;

	    public BankAccount(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;//initialbal+amount
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }
//400>900
	    public void withdraw(double amount) throws InsufficientBalanceException {
	        if (amount > balance) {
	            throw new InsufficientBalanceException("Insufficient balance for withdrawal."+amount);
	        } else {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public static void main(String[] args) { //main method
	        Scanner scanner = new Scanner(System.in);
	        BankAccount account = new BankAccount(500.0); // Initial balance of $500

	        System.out.println("Initial balance: " + account.getBalance());

	        System.out.print("Enter amount to deposit: ");
	        double depositAmount = scanner.nextDouble();
	        account.deposit(depositAmount);

	        System.out.print("Enter amount to withdraw: ");
	        double withdrawAmount = scanner.nextDouble();

	        try {
	            account.withdraw(withdrawAmount);
	            System.out.println("New balance: " + account.getBalance());
	        } catch (InsufficientBalanceException e) {
	            System.out.println("InsufficientBalanceException: " + e.getMessage());
	        }

	        scanner.close();
	    }
}
