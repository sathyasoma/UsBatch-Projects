package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class EntryDemo {

	public static void main(String[] args) {
				
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		
		hm.put(234, "keerthi");
		hm.put(355, "rahul");
		hm.put(890, "karthik");
		hm.put(456, "mahesh");
		hm.put(876, "sathya");
		hm.put(278, "soma");
		
		System.out.println(hm);
		
		//by using entryset() we enterd into set interface
		Set<Entry<Integer,String>> result=hm.entrySet();
		//byusing set interface object we can call iterator() method
		Iterator<Entry<Integer, String>> itr=result.iterator();
		
		while(itr.hasNext())
		{
			Entry<Integer,String> finalResult=itr.next();
			System.out.println(finalResult.getKey()+" "+finalResult.getValue());
		}
		
	}
}
