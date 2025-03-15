package com.Strings;

public class Demo1 {

	public static void main(String[] args) {
		
		String name="bahubali";
		String name1="java world";
		CharSequence ch="java world";
		
		System.out.println("comparing "+name +ch + ":"+name.contentEquals(ch) );
		System.out.println("comparing "+name +ch + ":"+name1.contentEquals(ch) );
	}
}
