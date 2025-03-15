package com.Strings;

public class Demo {

	public static void main(String[] args) {
		
		//litteral way
		String name="Capgemini";
		String name1="Capgemini";
		  
		//name.concat("india");//immuatable
		
		//System.out.println(name);
		//System.out.println(name==name1); // t f
		//System.out.println(name.equals(name1));//t f
		
		//by using new keyword
		
		String str= new String("demo");
		String str1=new String("demo");
		
		System.out.println(str==str1);//t f
		System.out.println(str.equals(str1));// t f
		
	}
}
