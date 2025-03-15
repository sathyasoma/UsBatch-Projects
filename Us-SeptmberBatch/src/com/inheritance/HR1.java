package com.inheritance;

import javax.swing.plaf.synth.SynthOptionPaneUI;

class User1{
	
	String userName; //global variable
	
	//inilization with parma constcrutor
	public User1(String userName)
	{
		this.userName=userName;
	}
	
	//display info 
	public void displayInfo()
	{
		System.out.println("UserName :"+userName);
	}
}

public class HR1 extends User1 {
	
	String role;
	
	//param construtor to inlization
	public HR1(String userName,String role)
	{
	  super(userName);
	  this.role=role;
	}
	
	//hr information
	public  void displayInfo()
	{
		super.displayInfo();
		System.out.println("Role Info:"+role);
	}

	public static void main(String[] args) {
		
		HR1 hr= new HR1("Sathya", "Hr");
		hr.displayInfo();
	}
}
