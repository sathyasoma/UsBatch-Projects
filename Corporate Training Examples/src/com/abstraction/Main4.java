package com.abstraction;
//Abstract Class Inheritance & Overrides in Java
abstract class Fruit
{
	abstract void displayTaste();
}
 
class Apple extends Fruit
{
	@Override
	void displayTaste()
	{
		System.out.println("Apple is sweet");
	}
}
 
class Orange extends Fruit
{
	@Override
	void displayTaste()
	{
		System.out.println("Orange is tangy");
	}
}
 
public class Main4 {
	public static void main(String[] args)
	{
		Fruit apple = new Apple();
		Fruit orange = new Orange();
 
		apple.displayTaste();
		orange.displayTaste();
	}
}
