package com.methods;

public class Employee {

	public void contactDetails()
	{
		String name="bahubali";
		int age=67;
		double salary=890.678;
		String address="mahishmathi";
	
		System.out.println("name of the Employee :"+name);
		System.out.println("age of the Employee :"+age);
		System.out.println("salary of the Employee :"+salary);
		System.out.println("address of the Employee :"+address);

	}
	
	public double calculateSalary(double salary)
	{
		return (12*salary);
	}
	
	public static void main(String[] args) {
		
		Employee emp= new Employee();
		
		System.out.println("Employee annual salary is :"+emp.calculateSalary(67000.89));
		emp.contactDetails();
		
	}
}
