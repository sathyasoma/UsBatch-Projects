package com.exceptions;

//exception class
class InsuffiecientFundException extends Exception{
	
	//we need to create parama ocnstrutor
	public InsuffiecientFundException(String message)
	{
		super(message);
	}
}

public class BankAccount {
 
	private double balance; //initial baance
	
	//param consctructor
	public BankAccount(double initialAmount)
	{
		this.balance=initialAmount;
	}
	
	//withdrwal method
	public void withdraw(double amount) throws InsuffiecientFundException
	{
		if(amount>balance)
		{
			throw new InsuffiecientFundException("Insuffiencet funds please check it "+amount);
		}
		balance-=amount;
		System.out.println("withdrwal succful:new blance is :"+balance);
	}
	//main method
	public static void main(String[] args) throws InsuffiecientFundException {
		
		BankAccount account= new  BankAccount(10000);
		
		account.withdraw(2000);
		System.out.println("remaing 1000 lines of code");
	}
}
