package com.constructors;

public class ParamDemo {
   
	public ParamDemo() //default consctructor
	{
		System.out.println("i am default constructor");
	}
	
	public ParamDemo(int age)
	{
		System.out.println("i am param consctrutor :"+age);
	}
	
	
	public ParamDemo(String name,int age)
	{
		System.out.println(name+"  "+age);
	}
	
	public static void main(String[] args) {
		
		ParamDemo pd= new ParamDemo();
		ParamDemo pd1= new ParamDemo(78);
		ParamDemo pd2= new ParamDemo("bahubali",7);
	}
}
