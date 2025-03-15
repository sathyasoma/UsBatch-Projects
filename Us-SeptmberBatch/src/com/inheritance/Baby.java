package com.inheritance;
class Mom{
	
	public void sleep()
	{
		System.out.println("sleep left directions its good for health");
	}
}
class Father1{
	public void display()
	{
		System.out.println("sleep right directions its good for health");
	}
	
}
public class Baby extends Mom{

	public static void main(String[] args) {
		
		Baby b= new Baby();
		b.sleep();//ambiguity(confusion btwn classes)
	}
}
