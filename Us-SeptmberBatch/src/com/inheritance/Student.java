package com.inheritance;
class Person{ // parent class
	
	String name;
	String address;
	int age;
		
 public Person(String name,String address,int age) 
 {
	 this.name=name;
	 this.address=address;
	 this.age=age;
 }
	public void dispalyInfo()
	{
		System.out.println("name is :"+name);
		System.out.println("name is :"+address);
		System.out.println("name is :"+age);
	}		
}
class Employee1 extends Person{
	int salary;
	
	public Employee1(String name,String address,int age,int salary)
	{
		super(name,address,age);
		this.salary=salary;
	}
	
	public void displayInfo()
	{
		super.dispalyInfo();
		System.out.println("employee salary is :"+salary);
	}
}
public class Student extends Person{
      
	int marks;
	
	public Student(String name,String address,int age,int marks)
	{
		super(name,address,age);//parent class param consctructor
		this.marks=marks;
	}
	
	public void displayInfo()
	{
		super.dispalyInfo();
		System.out.println("student marks:"+marks);
	}
	
	public static void main(String[] args) {
		
		Student st= new Student("sathya", "hyd", 45, 90);
		st.dispalyInfo();
		Employee1 emp= new Employee1("rahul", "usa", 89, 90000);
		emp.displayInfo();
	}
}
