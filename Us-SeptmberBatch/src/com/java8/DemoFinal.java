package com.java8;

interface AB {
	void m1();// abstarct method

	default void m2() { // default method
		System.out.println("i am default method implemntation");
	}
	//static method
	public static void engine()
	{
		System.out.println("this engine has 12000cc");
	}
}

public class DemoFinal implements AB {
	public void m1() {
	};

	@Override
	public void m2() {
		System.out.println("overrided default method logic");
	};

	public static void main(String[] args) {

		DemoFinal df= new DemoFinal();
		df.m2();
		
		//heree we can call static method by using interface directily
		AB.engine();
		
	}
}
