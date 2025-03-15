package com.collection;

import java.util.LinkedHashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
	//	HashSet hs= new HashSet();//hash-Table:more perfomrc 
		LinkedHashSet hs= new LinkedHashSet();//order is preserved:doubly linked list
		
		for(int i=0;i<=10;i++)
		{
			hs.add(i); //0 to 10
		}
		hs.add(-67);
		hs.add(3);
		hs.add(5);
		hs.add(8);
		hs.add(53);
		
		System.out.println(hs);
	}
}
