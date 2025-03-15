package com.java8;

interface A{
	void demo();
}
public class Demo2  {
	
	public static void main(String[] args) {
		
	A d=()->{System.out.println("welcome");};
	d.demo();
	}

	
}
