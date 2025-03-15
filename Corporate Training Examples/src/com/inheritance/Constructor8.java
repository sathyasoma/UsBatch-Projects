package com.inheritance;
//Write a Java program to Call a superclass constructor from sub/child class
class Super
{
	Super()
	{
		System.out.println("Super class Constructor called");
	}
}
class Sub extends Super
{
	Sub()
	{
		//super();
		System.out.println("Sub class Constructor called");
	}
}
public class Constructor8 {
	public static void main(String[] args)
	{
		Sub obj = new Sub();
	}
}
