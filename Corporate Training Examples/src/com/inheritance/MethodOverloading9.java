package com.inheritance;
//Write a Java program to Method Overloading and Inheritance
class Vehicle6	// Parent class
{
	void start()
	{
		System.out.println("Vehicle starting ...");
	}
}
class Car6 extends Vehicle6	// Child class
{
	void start(int count)
	{
		System.out.println("Starting " + count + " Cars ...");
	}
}
public class MethodOverloading9 {
	public static void main(String[] args)
	{
		Car6 car = new Car6();
		car.start();  	// Accessing parent class method
		car.start(3); 	// Accessing overloaded method in child class
	}
}
