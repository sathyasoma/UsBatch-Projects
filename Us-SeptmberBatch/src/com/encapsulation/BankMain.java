package com.encapsulation;

public class BankMain {

	public static void main(String[] args) {
		
		Bank bank= new Bank(6000.0);
		
		//depoasite
		bank.deposite(5000);
		System.out.println("current balance :"+bank.getBalance());
		
		//withdraw
		bank.withdraw(4000);
		System.out.println("current amount after withdraw :"+bank.getBalance());
	}
}
