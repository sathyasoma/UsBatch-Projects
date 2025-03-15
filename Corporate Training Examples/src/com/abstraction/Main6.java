package com.abstraction;
//Abstract Class with Variables & Methods in Java
abstract class Shape3
{
	String color;
	
 
	Shape3(String color)
	{
		this.color = color;
	}
 
	abstract void draw();
 
	void displayColor()
	{
		System.out.println("Shape color is : " + color);
	}
}
 
class Circle3 extends Shape3
{
	Circle3(String color)
	{
		super(color);
	}
 
	@Override
	void draw()
	{
		System.out.println("Drawing Circle");
	}
}
public class Main6 {
	public static void main(String[] args)
	{
		Circle3 circle = new Circle3("Blue");
		circle.displayColor();
		circle.draw();
	}
}
