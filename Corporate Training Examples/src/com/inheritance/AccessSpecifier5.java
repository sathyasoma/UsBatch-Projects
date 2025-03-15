package com.inheritance;
//Write a Java program to Demonstrate the protected access specifier


class Vehicle3	// Parent class
{
	protected String brand;
 
	protected void displayBrand()
	{
		System.out.println("Brand : " + brand);
	}
}
class Car3 extends Vehicle3	// Child class
{
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
}
public class AccessSpecifier5 {
	public static void main(String[] args)
	{        
		Car3 car = new Car3();   // Create an object of the child class        
		car.setBrand("Toyota");	 // Set the brand using the public method        
		car.displayBrand();	  // Access the protected member and method
	}
}
