package com.arrays;

public class Demo2 {
public static void main(String[] args) {
	
	String names[] = {"keerthi","kattappa","devasena","bahubali"};
	
	System.out.println(names[0]);
	System.out.println(names[1]);
	System.out.println(names[2]);
	System.out.println(names[3]);
	
	System.out.println("***by using for loop**");
	
	for(int i=0;i<=3;i++)
	{
		System.out.println(names[i]);
	}
	
	System.out.println("***by using for loop**");
	for(int i=0;i<names.length;i++)
	{
		System.out.println(names[i]);
	}
	
	System.out.println("***for each loop****");
	
	for(String s:names)
	{
		System.out.println(s);
	}
}
}
