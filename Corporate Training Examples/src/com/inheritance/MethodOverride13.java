package com.inheritance;
//Write a Java program to Method Overriding with Exception Handling

class Parent8  // Parent class	
{
	void display() throws Exception
	{
		System.out.println("Parent's display method");
	}
}
 
class Child8 extends Parent8	// Child class
{
	@Override
	void display() throws RuntimeException
	{
		System.out.println("Child's display method");
	}
}

public class MethodOverride13 {
	public static void main(String[] args)
	{
		Parent8 parent = new Child8();
		try
		{
			parent.display();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
