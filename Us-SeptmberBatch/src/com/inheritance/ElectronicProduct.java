package com.inheritance;


class Product{
	
	String name;
	double price;
	
	public Product(String name,double price)
	{
		this.name=name;
		this.price=price;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void displayInfo() {
		System.out.println("Product Name :"+name +" Price $ :"+price);
	}
}

public class ElectronicProduct extends Product {
    
	
	String warrenty;
	
	public ElectronicProduct(String name,double price,String warrenty)
	{
		super(name,price);
		this.warrenty=warrenty;
	}
	
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Warrenty :"+warrenty);
	}
	
	public static void main(String[] args) {
	
		ElectronicProduct el= new ElectronicProduct("Laptop", 56000.89, "1 year");
		el.displayInfo();
	}
}
