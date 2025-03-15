package com.java8;

interface Left{
	
	default void m1() {
		System.out.println("Left interface m1 method");
	}
}

interface Right{
	
	default void m1() {
		System.out.println("Right interface m1 method");
	}
}

public class TestDefault implements Left,Right{ //multiple inheritance

	public void m1() {
		System.out.println("i am overriden of m1 method");
		Left.super.m1();
		Right.super.m1();
	}
	public static void main(String[] args) {
		
		TestDefault td= new TestDefault();
		td.m1();
	}
}
