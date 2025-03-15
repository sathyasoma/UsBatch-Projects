package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.UnaryOperator;

public class Methods {

	public static void main(String[] args) {
		
		
		ArrayList<String>  al= new ArrayList();
		
		al.add("devasena");
		al.add("bahuali");
		al.add("ramu");
		al.set(0, "ballala");
		al.add("keerthi");
		al.add("goat");
		al.add("java");
		al.add("html");
		
		al.remove(1);
		al.remove("goat");
		System.out.println(al.contains("ramu"));
		System.out.println(al.get(2));
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		
		//for each loop iterate the values
		
		for(String name:al)
		{
			System.out.println(name);
		}
		System.out.println("========converting objetct to arry===");
		
		Object[] arry=al.toArray();
		for(Object ar:arry)
		{
			System.out.println(ar);
		}
		
		//sorting
		Collections.sort(al);
		System.out.println(al);
		
		//copying one list to another list 
		
	ArrayList<String> list= new ArrayList(al);	
	System.out.println(list);
	
	//sublist
	List<String> li=al.subList(1, 4);
	System.out.println(li);
	
	//replace allthe elemnts 
	//UnaryOperator<String> toUpper=String::toUpperCase; //double colon operator
	//al.replaceAll(toUpper);
	System.out.println(al);
	//reains only the elements in the list taht arecontained in the specified collection
	al.retainAll(Arrays.asList("java","html"));
	System.out.println(al);
	
	}
}
