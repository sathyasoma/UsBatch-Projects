package com.inheritance;

//hirarchial relation
class Father{
	
	public void meet()
	{
		System.out.println("okay i can meet both of you");
	}
	
}

class Elder extends Father{
	
	public void usa()
	{
		System.out.println("want to go usa,meet father");
	}
}

public class Yonger extends  Father{
    
	public void bdy()
	{
		System.out.println("CELEBRATING BDY BUT,WANT MEET DAD");
	}
	
	public static void main(String[] args) {
		
		Yonger y= new Yonger();
		y.bdy();
		y.meet();
		
		Elder ed= new Elder();
		ed.usa();
		ed.meet();
	}
}
