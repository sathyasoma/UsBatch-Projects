package com.collection;

import java.util.TreeSet;

//we can predict output
//mandetory to use generics concept
public class TreeDemo {

	public static void main(String[] args) {
		
		TreeSet<String> ts= new TreeSet();//alphabetical order:Comparator
		ts.add("devasena");
		ts.add("ballala");
		ts.add("kattapa");
		ts.add("rajamatha");
		ts.add("kalakeya");
		ts.add("bahubali");
		
		System.out.println(ts);
	}
}
