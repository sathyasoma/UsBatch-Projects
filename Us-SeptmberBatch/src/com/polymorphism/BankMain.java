package com.polymorphism;

class Bank{
	
	public double calculateInterest(double principal,int time)
	{
		double rate=6.0;
		return (principal*rate*time)/100;
	}
	
	public double calculateInterest(double principal,int time,double rate)
	{
		return (principal*rate*time)/100;
	}
	
	public double calculateInterest(double principal,int time,double rate,int coumpoundfreq)
	{

		return principal*Math.pow((1+rate/(100*coumpoundfreq)), coumpoundfreq*time)-principal;
	}
	
}

public class BankMain {

	public static void main(String[] args) {
		
		Bank bank= new Bank();
		
		System.out.println(bank.calculateInterest(12, 67));
		
	}
}
