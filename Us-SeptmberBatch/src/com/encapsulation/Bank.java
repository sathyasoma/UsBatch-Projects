package com.encapsulation;

public class Bank {

	//private fields 
	private double balance;
	
	public Bank(double initialBalanace)
	{
		if(initialBalanace>0.0)
		{
			balance=initialBalanace;
		}
	}
	
	//getters and setters methods 
	
	//get the balnace
	public double getBalance()
	{
		return balance;
	}
	
	
	//setter method to deposite some amount 
	public void deposite(double amount)
	{
		if(amount>0.0)
		{
			balance=balance+amount;
		}
		else {
			System.out.println("invalid depoasite amount");
		}
	}
	
	//setter for the balmce for withdraw
	
	public void withdraw(double amount)
	{
		if(amount>0.0 && amount<=balance) // 4000<=11000
		{
			balance=balance-amount; //balance=11000-4000
		}
		else {
			System.out.println("insuffiiecint funds");
		}
	}
	
}
