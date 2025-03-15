package com.association;

public class Adress {

	int hunum;
	String colony;
	String state;
	int pinocde;
	
	
	public Adress(int hunum,String colony,String state,int pincode)
	{
		this.colony=colony;
		this.hunum=hunum;
		this.pinocde=pincode;
		this.state=state;	
	}
	
	public void showAddress()
	{
		System.out.println("House Number :"+hunum);
		System.out.println("Colony NAME :"+colony);
		System.out.println("nAME OF State :"+state);
		System.out.println("pincode loaction :"+pinocde);
	}
}
