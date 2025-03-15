package com.java8;

public class MethodRef {
     
	public static void m1()  //staic refence
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("child thread");
		}
	}
	
	public static void main(String[] args) {
		
		
		Runnable r= MethodRef::m1;
		 Thread t= new Thread(r);
		 
		 for(int i=0;i<=10;i++)
			{
				System.out.println("main thread");
			}
	}
}
