package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList();
		
		al.add("bahubali");
		al.add("devasena");
		al.add("kattapa");
		al.add("keerthi");
		al.add("ballala");
		al.add("mahoshmathi");
		al.add("kalakeya");
		
		System.out.println(al);
		
		//iterator
		Iterator<String> itr=al.iterator();
		
		while(itr.hasNext())
		{
			if(itr.next().contains("keerthi"))
			{
				itr.remove();
			}
		}
		
		//printing remaing values 
		
		for(String s:al)
		{
			System.out.println(s);
		}
		//printing values in reverse direction
		
		ListIterator<String> ltr=al.listIterator();
		
		while(ltr.hasPrevious())
		{
			if(ltr.previous().contains("devasena"))
			{
				ltr.set("ramnjaneya");
			}
		}
		
		//printing thevalues
		
		for(String ds:al)
		{
			System.out.println(ds);
		}
	}
}
