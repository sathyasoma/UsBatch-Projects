package com.constructors;

public class Employee {

	int empid;
	String empName;
	
	public Employee()
	{
		empid=123;
		empName="keerthi";
	}
	
	public void display()
	{
		System.out.println("empid :"+empid+" empname :"+empName);
	}

	public static void main(String[] args) {
		
		Employee emp= new Employee();
		emp.display();
		
	}
}
