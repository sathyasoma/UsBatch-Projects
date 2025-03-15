package com.methods;

public class MethodsDemo {
//instance method without return type without paramters
	public void display()
	{
		System.out.println("i am display method");
	}
//instance method with paramters and with return type
	public double engine(int rpm)
	{
		return rpm;
	}
	
//instance method without rtrn type with paramters
	public void screen(String type)
	{
		System.out.println("my screen type is :"+type);
	}
		
	public static void main(String[] args) {
			
		MethodsDemo md= new MethodsDemo();
		md.display();
		System.out.println("my engine rpm is :"+md.engine(567)+"km/hr");
		md.screen("led");
	}
}
