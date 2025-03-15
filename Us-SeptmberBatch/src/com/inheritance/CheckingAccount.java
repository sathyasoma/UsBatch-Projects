package com.inheritance;

class Account {

	int accountNumber;
	double balance;

	// parma constcrutor inilization
	public Account(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// deposite amount
	public void deposite(double amount) {
		balance = balance + amount;
	}

	// withdraw amount
	public void withDraw(double amount) {
		if (amount <= balance) {
			balance = balance - amount;
		} else {
			System.out.println("Insuffiencnt Funds...");
		}
	}
}

class SavingsAccount extends Account {
	double intrestRate;

	// paramContsrutor inilization
	public SavingsAccount(int accountNumber, double balance, double intrestRate) {
		super(accountNumber, balance);
		this.intrestRate = intrestRate;
	}

	// count interstrate
	public void addIntRest() {
		balance = balance + balance * intrestRate;
	}
}

public class CheckingAccount extends Account {
	double overDraftLimit;

	// inilization
	public CheckingAccount(int accountNumber, double balance, double overDraftLimit) {
		super(accountNumber, balance);
		this.overDraftLimit = overDraftLimit;
	}

	public void withdraw(double amount)
	{
		  if(amount<=balance+overDraftLimit)
		  {
			  balance=balance-amount;
		  }
		  else
		  {
			  System.out.println("exceed overdraft limit");
		  }
	}
	public static void main(String[] args) {

		SavingsAccount sa= new SavingsAccount(101, 500.0, 100.0);
		sa.addIntRest();
		System.out.println("Savings Account balance is :"
				+sa.balance);
		
		CheckingAccount ca= new CheckingAccount(201, 500.0, 100.0);
		ca.withdraw(600.0);
		System.out.println("Overdraft limit :"+ca.balance);
	}
}
