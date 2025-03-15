package com.inheritance;

//Write a Java program to Create an Student class by inheriting Person class
class Person
{
	String name;
	int age;
 
	Person(int age, String name)
	{
		this.name = name;
		this.age = age;
	}
}
class Student extends Person
{
	int id;
	float per;
 
	Student(int idn, String name, int age, float percent)
	{
		super(age, name);
		id = idn;
		per = percent;
	}
 
	void printStudentDetails()
	{
		System.out.println("Student ID     :  " + id);
		System.out.println("Student Name   :  " + name);
		System.out.println("Student Age    :  " + age);
		System.out.println("Student Percentage :  " + per);
	}
}
public class InheritingExample6 {
	public static void main(String[] args)
	{
		Student stu = new Student(1000, "Ram Kumar", 25, 88.96f);
		stu.printStudentDetails();
	}
}
