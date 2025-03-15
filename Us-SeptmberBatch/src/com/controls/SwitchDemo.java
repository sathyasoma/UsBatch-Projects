package com.controls;

public class SwitchDemo {

	public static void main(String[] args) {
		
		String lights="green";
		int age=90;
		
		switch(lights)
		{
	
		case "yellow":
			System.out.println("ready to leave");
		case "green":
			System.out.println("you may go");		
			break;
		case "red":
			System.out.println("stop.....");
			break;
		default:
			System.out.println("please enter valid light");
		}
		
		
	}
}
