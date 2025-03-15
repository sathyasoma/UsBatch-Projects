package com.variables;


public class Bank {

	static String bankName = "sbi"; // static variable
	int accountNumber = 764763653; // instance variable
	static String address = "hyderabad"; // static variable

	public static void main(String[] args) {
   
		Bank bank= new Bank();//object createion
		
		String addarNumber = "233-345-345";//local variables
		
		System.out.println("Bank Name is :"+Bank.bankName);
		System.out.println("bank account number :"+bank.accountNumber);
		System.out.println("bank address is :"+Bank.address);
		System.out.println("addar number is :"+addarNumber);

	}
}
