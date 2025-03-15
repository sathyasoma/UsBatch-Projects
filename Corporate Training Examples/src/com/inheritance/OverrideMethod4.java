package com.inheritance;
//Write a Java program to Override a base class method into a derived class

class Vehicle2	// Base class
{
	void display()
	{
		System.out.println("This is a Vehicle");
	}
}
class Car2 extends Vehicle2	// Derived class
{
	@Override
	void display()
	{
		System.out.println("This is a Car");
	}
}
public class OverrideMethod4 {
	public static void main(String[] args)
	{        
		Car2 car = new Car2();	// Create an object of the derived class       
		car.display();		 // Call the overridden method
	}
}
