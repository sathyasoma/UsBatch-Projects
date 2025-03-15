package com.inheritance;
//Write a Java program to Implement single inheritance

class Animal // Parent class (Superclass)
{
	protected String name;
 
	public Animal(String name)
	{
		this.name = name;
	}
 
	public void eat()
	{
		System.out.println(name + " is Eating");
	}
}
class Dog extends Animal // Child class (Subclass) inheriting from Animal
{
	public Dog(String name)
	{
		super(name);
	}
 
	public void bark()
	{
		System.out.println(name + " is Barking");
	}
}
public class SingleInheritance1 {
	public static void main(String[] args)
	{        
		Dog dog = new Dog("Buddy");	 // Create an instance of Dog        
 
		dog.eat();	// Call methods from Animal class        
		dog.bark();	// Call methods from Dog class
	}
}
