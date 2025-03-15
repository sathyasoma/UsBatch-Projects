package com.mcq;

public class Test12 {
	static  
	{  
	System.out.println("Static Block-1");  
	}    
	public static void main(String args[])  

	{    
	System.out.println("Main Method");    
	Test12 t= new Test12();
	}    
	static  
	{  
	System.out.println("Static Block-2");  
	}   	
	{
		System.out.println("i am instant block");
	}
}
//Static Block-1, Static Block-2, Main Method
//Static Block-2, Static Block-1, Main Method
//Main Method, Static Block-1, Static Block-2
//Static Block-1, Main Method, Static Block-2
//Main Method, Static Block-2, Static Block-1