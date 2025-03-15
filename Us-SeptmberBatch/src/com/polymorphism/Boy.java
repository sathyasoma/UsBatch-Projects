package com.polymorphism;

class Mother{
	
	public void eat()
	{
		System.out.println("dont eat icecream ");
	}
}

public class Boy extends Mother{
	
	@Override
	public void eat()
	{
		System.out.println("i want eat icecream ");
	}
	public static void main(String[] args) {
		
		Boy boy= new Boy();
		boy.eat();
	}
}
