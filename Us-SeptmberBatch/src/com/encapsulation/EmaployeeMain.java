package com.encapsulation;

public class EmaployeeMain {

	public static void main(String[] args) {
		
		Employee emp= new Employee();
		
		emp.setName("bahubali");
		emp.setAge(34);
		
		System.out.println("Employee name is :"+emp.getName());//bahubali
		System.out.println("Employee age is :"+emp.getAge());
	}
}
