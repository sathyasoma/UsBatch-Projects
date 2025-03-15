package com.hotel.management;

public class MainHotelReception {

	
	public static void main(String[] args) {
		
		
		DeluxRoom delux= new DeluxRoom("delux-23", 11, 5000.0, 1000.78);
		delux.roomInfo();
		
		StandardRoom standard= new StandardRoom("standard-12", 22, 800.78, false);
		standard.roomInfo();
		
		Customer customer= new Customer("19878", "keerthi", "7729938257", delux);
		customer.rentRoom();
		customer.show();
	}
}
