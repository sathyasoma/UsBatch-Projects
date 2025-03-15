package com.inheritance;
//Write a Java program to Call the method with the same name using super keyword
class Parent	// Parent class
{
	void display()
	{
		System.out.println("Parent class display method");
	}
}
class Child1 extends Parent	 // Child class 1
{
	void display()
	{
		super.display();  // Call the display() method of the parent class
		System.out.println("Child 1 class display method");
	}
}
class Child2 extends Parent	  // Child class 2
{
	void display()
	{
		super.display();  // Call the display() method of the parent class
		System.out.println("Child 2 class display method");
	}
}
public class SuperKeyword7 {
	public static void main(String[] args)
	{
		Child1 child1 = new Child1();	// Create objects of the Child classes
		Child2 child2 = new Child2();
 
		child1.display();	// Call the display() method
		child2.display();
	}
}
