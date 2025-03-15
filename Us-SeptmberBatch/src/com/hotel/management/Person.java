package com.hotel.management;

//person abstract class
public abstract class Person {
 
	protected String id;
	protected String name;
	protected String contactNum;
	
	//person pararm constructor
	public Person(String id,String name,String contactNum)
	{
		this.id=id;
		this.name=name;
		this.contactNum=contactNum;
	}
	
	//abstarct method to show details
	abstract void show();
}
