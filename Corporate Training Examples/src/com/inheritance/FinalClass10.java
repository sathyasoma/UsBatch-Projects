package com.inheritance;

//Write a Java program to Final Class and Inheritance
final class Vehicle7	// Final parent class
{
	void start()
	{
		System.out.println("Vehicle starting ...");
	}
}
public class FinalClass10 {
	public static void main(String[] args)
	{
		Vehicle7 vehicle = new Vehicle7();
		vehicle.start();
	}
}
