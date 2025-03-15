package com.polymorphism;

public class Calculator {

	public void addition(int a,int b,int c)
	{
		System.out.println("addition of three int values :"+(a+b+c));
	}
	
	public void addition(int a,int b)
	{
		System.out.println("addition of two int values :"+(a+b));
	}
	
	public void addition(float a,float b)
	{
		System.out.println("addition of two float vlaues:"+(a+b));
	}
	
	public void addition(int a,float b)
	{
		System.out.println("addition of int,float values :"+(a+b));
	}
	public void addition(float a,int b)
	{
		System.out.println("addition of float,int values :"+(a+b));
	}
	
	public static void main(String[] args) {
		
		Calculator ct= new Calculator();
		ct.addition(34, 89);
		ct.addition(78.65f, 89);
		ct.addition(67,34, 30);
		ct.addition('a', 'a');//type promotion
		
		
	}
}
