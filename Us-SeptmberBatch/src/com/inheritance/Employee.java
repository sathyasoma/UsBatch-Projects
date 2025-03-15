package com.inheritance;

public class Employee {
	String name;//soma
	String address;
	int age;
	
	public Employee(String name,String address,int age) {
		 this.name=name;
		 address="";
		 age=78;
	}
	
	public void displayInfo() //this isa method
	{	
		
		System.out.println("name is :"+name);//looking fol=r global variable
		System.out.println("name is :"+address);
		System.out.println("name is :"+age);
	}
	
	public static void main(String[] args) {
		
		Employee emp= new Employee("sathya","soma",90);//2 manager  hr
		
		emp.displayInfo();
		
	}
}
