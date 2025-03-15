package com.abstraction;
//Abstract Class Constructors & Methods in Java
abstract class Vehicle
{
	String brand;
 
	Vehicle(String brand)
	{
		this.brand = brand;
	}
 
	abstract void drive();
}
 
class Car extends Vehicle
{
	Car(String brand)
	{
		super(brand);
	}
 
	@Override
	void drive()
	{
		System.out.println("Driving a " + brand + " car");
	}
}
public class Main2 {
	public static void main(String[] args)
	{
		Car car = new Car("Toyota");
		car.drive();
	}
}
