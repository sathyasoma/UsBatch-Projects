package com.hotel.management;

public class Customer extends Person {

	private Room room; //has a realtion
	private String roomId;//102
	
	//param consctrutor inilization
	public Customer(String id,String name,String contactNum,Room room)
	{
		super(id,name,contactNum);
		this.room=room;
	}
	
	//customer rents a room 
	public void rentRoom()
	{
		this.roomId=room.getRoomId();//102
	}
	
	//implimentation for abstarct method from person class
	
	@Override
	void show()
	{
		System.out.println("==========Customer Information============");
		System.out.println("Customer Id             :"+super.id);
		System.out.println("Customer Name           :"+super.name);
		System.out.println("Customer contact number :"+super.contactNum);
		System.out.println("Customer Room id        :"+roomId);
	}
}
