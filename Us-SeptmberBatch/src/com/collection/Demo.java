package com.collection;

import java.util.Vector;
//it will allow both homo and hetro
//duplicates are allowd
//insertion order is preserved 
//null insertion also possible
public class Demo {

	public static void main(String[] args) {
		
		
		//ArrayList al= new ArrayList();
		//LinkedList al= new LinkedList();
		Vector  al= new Vector();
		//Stack al= new Stack();
		//primitive to object==>autoboxing
		//object to primitive==>autounboxing
		System.out.println("initial size :"+al.size());
		System.out.println("initial capacity:"+al.capacity());
		al.add(45);
		al.add(new Integer(45));
		al.add("welcome");
		al.add("soma");
		al.add(null);
		al.add(78.90);
		al.add(true);
		al.add("welcome");
		al.add(67);
		al.add('f');
		al.add("sathya"); //this is 11 th value
		System.out.println("final size :"+al.size());
		System.out.println("final capacity:"+al.capacity());
		
		//System.out.println(al);
	}
	
	
}
