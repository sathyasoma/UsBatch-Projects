package com.inheritance;

public class Admin extends Developer{
	public void modify()
	{
		System.out.println("i can do anything");
	}
	public static void main(String[] args) {
		Admin ad= new Admin();
		ad.read();
		ad.write();
		ad.modify();
	}
}
