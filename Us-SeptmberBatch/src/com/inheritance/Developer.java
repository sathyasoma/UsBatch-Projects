package com.inheritance;

public class Developer extends User {
   
	public void write()
	{
		System.out.println("i can write");
	}
	public static void main(String[] args) {
		
		Developer dev= new Developer();
		dev.read();
		dev.write();
		
	}
}
