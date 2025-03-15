package com.interfaces;
//Write a Java program to demonstrate the use of an interface

interface Shape
{
	void draw();
}
 
class Circle implements Shape
{
	@Override
	public void draw()
	{
		System.out.println("Drawing a circle");
	}
}
public class Main1 {
	public static void main(String[] args)
	{
		Circle circle = new Circle();
		circle.draw();
	}
}
