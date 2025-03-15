package com.association;

class Engine{
	
	String type;
	
	//parma construtor
	public Engine(String type)
	{
		this.type=type;
	}
	
	public void start()
	{
		System.out.println("Engine started :"+type);
	}	
}

class Car{
	
	String model;
	Engine sathya;//has relation "electric"
  
	//to inilize param constructir 
	public Car(String model,String engineType)
	{
		this.model=model;
		this.sathya=new Engine(engineType);
	}
	
	//deatils about car 
	public void startCar()
	{
		System.out.println("starting a car :"+model);
		sathya.start();
	}
}

public class CompositionExample {

	public static void main(String[] args) {
		
		
		Car c= new Car("Tesla","electric");
		c.startCar();
	}
}
