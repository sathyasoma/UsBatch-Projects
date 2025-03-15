package com.inheritance;
class Animal1	// Grandparent class
{
	protected String name;
 
	public Animal1(String name)
	{
		this.name = name;
	}
 
	public void eat()
	{
		System.out.println(name + " is Eating");
	}
}
class Dog1 extends Animal1	// Parent class inheriting from Animal
{
	public Dog1(String name)
	{
		super(name);
	}
 
	public void bark()
	{
		System.out.println(name + " is Barking");
	}
}
class Puppy extends Dog1		// Child class inheriting from Dog
{
	public Puppy(String name)
	{
		super(name);
	}
 
	public void play()
	{
		System.out.println(name + " is Playing");
	}
}
public class MultilevelInheritance2 {
	public static void main(String[] args)
	{        
		Puppy puppy = new Puppy("Buddy");	// Create an instance of Puppy        
 
		puppy.eat();	// Call methods from Animal class        
		puppy.bark();	// Call methods from Dog class        
		puppy.play();	// Call methods from Puppy class
	}
}
