package com.methods;

public class StaticDemo {
    
	public static void electronic()
	{
		System.out.println("nowaydys everything is electronic");
	}
	
	public static String dinner()
	{
		return "dinner is not prepared";
	}
	public static void main(String[] args) {
		
		System.out.println(StaticDemo.dinner());
		StaticDemo.electronic();
	}
}
