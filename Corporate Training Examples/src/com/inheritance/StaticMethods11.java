package com.inheritance;
//Write a Java program to Static Methods and Inheritance
class Vehicle8	// Parent class
{
	static void display()
	{
		System.out.println("This is a Vehicle");
	}
}
class Car8 extends Vehicle8	// Child class
{
	static void display()
	{
		System.out.println("This is a Car");
	}
}
public class StaticMethods11 {
	public static void main(String[] args)
	{
		Vehicle8.display();   // Accessing static method in parent class
		Car8.display();       // Accessing static method in child class
	}
}
