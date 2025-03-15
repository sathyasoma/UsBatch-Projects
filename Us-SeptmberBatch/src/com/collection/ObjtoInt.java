package com.collection;

import java.util.ArrayList;

public class ObjtoInt {

	public static void main(String[] args) {
		
		
		ArrayList al= new ArrayList();
		
		   for(int i=0;i<=10;i++)
		   {
			   al.add(i); //0 to 10
		   }
		   
		   System.out.println("by using for loop ");
		   
		   for(int i=0;i<=10;i++)
		   {
			   System.out.println(al.get(i));
		   }
		   
		   System.out.println("print by using for each loop");
		   
		   for(Object obj:al)
		   {
			   System.out.println(obj);
		   }
		   
		   System.out.println("printing odd numbers from th ecollection obj");
		   
		   
		   for(Object o:al)
		   {
			   Integer i=(Integer) o;
			   if(i%2!=0)
			   {
				   System.out.println(i);
			   }
		   }
	}
}
