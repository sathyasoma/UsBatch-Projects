package com.inheritance;
//Write a Java program to Multiple Inheritance using Interfaces
interface Flyable   // First interface
{
	void fly();
}
 
interface Swimmable	 // Second interface
{
	void swim();
}
 
class Bird implements Flyable, Swimmable  // Class implementing multiple interfaces
{
	@Override
	public void fly()
	{
		System.out.println("Bird is Flying");
	}
 
	@Override
	public void swim()
	{
		System.out.println("Bird is Swimming");
	}
}
public class Interfaces12 {
	public static void main(String[] args)
	{
		Bird bird = new Bird();
		bird.fly();
		bird.swim();
	}
}
