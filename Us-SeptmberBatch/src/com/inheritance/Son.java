package com.inheritance;

//MULTILEVEL INHERITANCE
class GrandFather{
	
	public void tales()
	{
		System.out.println("we have lot of tales");
	}
	public void electronic()
	{
		System.out.println("we dont have any idea about elecey=tronics");
	}
}
class Dad extends GrandFather{
	
	public void house()
	{
		System.out.println("we ahve 3bhk house");
	}	
}
public class Son extends Dad{
         
	public void enjoy()
	{
		System.out.println("i am enjoying alwys");
	}
	public static void main(String[] args) {
		
		Son s= new Son();
		s.enjoy();
		s.house();
		s.tales();
		
	}
}
