package com.inheritance;
//single level inheritance 

public class Child extends Parent{
  
	public void demo()
	{
		System.out.println("i am demo of child class");
	}
	
	public static void main(String[] args) {
		
		Child ch= new Child();
		ch.demo();
		ch.m1();
		ch.m2();
		
	}
}
