package com.collection;

import java.util.LinkedHashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		
		LinkedHashMap hm= new LinkedHashMap();
		
		hm.put(123, "sathya");
		hm.put(698, "mahesh");
		hm.put(253, "karthik");
		hm.put(908, "rahul");
		hm.put(123, "goat");
		
		hm.put("soma", 5000);
		hm.put("keerthi", 7000);
		hm.put("prakash", 2000);
		
		System.out.println(hm);
		
		System.out.println(hm.size());
		System.out.println(hm.containsKey(908));
		System.out.println(hm.containsValue(5000));
		System.out.println(hm.remove(123));
		System.out.println(hm.size());
	}
}
