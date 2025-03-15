package com.hotel.management;

//Abstract class of Room
public abstract class Room {

	//variables
	protected String roomId;
	protected int roomNum;
	protected double roomFare;
	
	//paramconstrcutor
	public Room(String roomId,int roomNum,double roomFare)
	{
		this.roomFare=roomFare;
		this.roomId=roomId;
		this.roomNum=roomNum;
	}
	//getters and setters

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

	public double getRoomFare() {
		return roomFare;
	}

	public void setRoomFare(double roomFare) {
		this.roomFare = roomFare;
	}
	
	
	//abstarct method room info
	abstract void roomInfo();
}
