package com.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIter {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList();

		al.add("bahubali");
		al.add("devasena");
		al.add("kattapa");
		al.add("keerthi");
		al.add("ballala");
		al.add("mahoshmathi");
		al.add("kalakeya");

		System.out.println(al);
		
		//listiterator
		
		ListIterator<String> ltr=al.listIterator();
		while(ltr.hasNext()) {
			if(ltr.next().contains("keerthi"))
			{
				ltr.set("sathya");
			}
		}
		
		//printing forward direction
		for(String s:al)
		{
			System.out.println(s);
		}
		
		System.out.println("---------------");
		
		//backward direction
		
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
		
	}
}
