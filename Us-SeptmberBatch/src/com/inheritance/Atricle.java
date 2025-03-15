package com.inheritance;

class Content{
	
	String title;
	
	//constrructor initilization
	public Content(String title)
	{
		this.title=title;
	}
	
	//display the content
	public void displayInfo()
	{
		System.out.println("Title info :"+title);
	}
	
}

public class Atricle extends Content {
    
	String body;
	
	//param constructor inilization
	public Atricle(String title,String body)
	{
		super(title);
		this.body=body;
	}
	
	//dipsly the information about article
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Body info :"+body);
	}
	public static void main(String[] args) {
		
		
		Atricle at= new Atricle("Java Inheritance ", "This Article explains about Inheritcance");
		
		at.displayInfo();
	}
}
