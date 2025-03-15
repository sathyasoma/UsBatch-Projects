package com.encapsulation;


public class Employee {//employee class
	
	//private fields 
	private String name; //2 methods//bahubali
	private int age;//2
	
	//getters and setters
	
	//gettr method to get name
	public String getName()
	{
		return name;
	}
	
	//setter method to set the name
	public void setName(String name)
	{
		this.name=name;//bahubali
	}
	
	//getter method to get the age
	
	public int getAge()
	{
		return age;
	}
	
	
	//public setter method to set the age
	public void setAge(int age)
	{
		if(age>0)
		{
			this.age=age;
		}
		else {
			System.out.println("Age is not negitive");
		}
	}
	
}
