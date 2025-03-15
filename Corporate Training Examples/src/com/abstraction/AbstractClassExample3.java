package com.abstraction;
//Abstract vs Concrete Methods in Java
abstract class Shape1
{    
	abstract double calculateArea();// Abstract method (no body)
 
	void display()
	{
		System.out.println("This is a shape");
	}
}
 
class Circle1 extends Shape1
{
	double radius;
 
	Circle1(double radius) // Constructor
	{
		this.radius = radius;
	}
 
	@Override
	double calculateArea()// Implementation of the abstract method
	{
		return Math.PI * radius * radius;
	}
}
 
class Rectangle1 extends Shape1
{
	double length;
	double width;
 
	Rectangle1(double length, double width) // Constructor
	{
		this.length = length;
		this.width = width;
	}
 
	@Override
	double calculateArea()// Implementation of the abstract method
	{
		return length * width;
	}
}
public class AbstractClassExample3 {
	public static void main(String[] args)
	{
		Circle1 circle = new Circle1(5);
		Rectangle1 rectangle = new Rectangle1(4, 6);
 
		System.out.println("Circle Area : " + circle.calculateArea());
		circle.display();
 
		System.out.println("Rectangle Area : " + rectangle.calculateArea());
		rectangle.display();
	}
}
