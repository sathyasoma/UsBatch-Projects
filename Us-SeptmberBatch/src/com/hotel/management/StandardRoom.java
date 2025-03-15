package com.hotel.management;

public class StandardRoom extends Room{

	private boolean ac_availability;
	
	//param consctrutor
	public StandardRoom(String roomId,int roomNum,double roomFare,boolean ac_availability)
	{
		super(roomId,roomNum,roomFare);
		this.ac_availability=ac_availability;
		
	}

	//provide startdard room details
	@Override
	void roomInfo() {
		System.out.println("==========Startd Room Inforamtion===========");
		System.out.println("Room Id        :"+super.roomId);
		System.out.println("Room Number     :"+super.roomNum);
		System.out.println("Room Fare       :"+super.roomFare);
		System.out.println("Ac Availability  :"+ac_availability);
		System.out.println(".....");
	}
	
}
