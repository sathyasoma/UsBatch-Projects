package com.hotel.management;

public class DeluxRoom  extends Room {

	private double roomSize;
	
	//param consctrutor  with parant and child
	public DeluxRoom(String roomId,int roomNum,double roomFare,double roomSize)
	{
		super(roomId,roomNum,roomFare);
		this.roomSize=roomSize;	
	}
	
	//providing implimentation for delux room
	@Override
	void roomInfo() {
		System.out.println("================Delux Room INformation==========");
		System.out.println("Room Id            :"+super.roomId);
		System.out.println("Room Number         :"+super.roomNum);
		System.out.println("Room Fare           :"+super.roomFare);
		System.out.println("Room Size           :"+this.roomSize);
		System.out.println(".................");
	}
	
	
}
