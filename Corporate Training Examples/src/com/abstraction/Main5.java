package com.abstraction;
//Abstract Class with Static Method in Java
abstract class Shape2
{
	abstract void draw();
 
	static void display()
	{
		System.out.println("This is a Shape");
	}
}
 
class Circle2 extends Shape2
{
	@Override
	void draw()
	{
		System.out.println("Drawing Circle");
	}
}
public class Main5 {
	public static void main(String[] args)
	{
		Shape2.display();
		Circle2 circle = new Circle2();
		circle.draw();
	}
}
