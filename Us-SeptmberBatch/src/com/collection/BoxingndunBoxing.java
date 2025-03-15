package com.collection;

public class BoxingndunBoxing {

	public static void main(String[] args) {
		
		int x=70; //primitive value
		
		Integer y= new Integer(x);
		
		Integer z=50;
		
		System.out.println(y+" "+z);
		
		
		//unboxing 
		
		Integer a=new Integer(80);
		
		int b=a;
		
		System.out.println(b);
		
		
	}
}
