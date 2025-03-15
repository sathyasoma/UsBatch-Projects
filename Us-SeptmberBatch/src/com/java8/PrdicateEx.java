package com.java8;

import java.util.function.Predicate;

public class PrdicateEx {

	public static void main(String[] args) {

		//predefinde functional interface
		Predicate<Integer> p = i -> i % 2 == 0;
		System.out.println(p.test(34));//true
		System.out.println(p.test(11));
		System.out.println(p.test(67));
		System.out.println(p.test(89));
		System.out.println(p.test(26));
		
		System.out.println("----------------String based condition-----------");

		String[] names = { "bahubali", "rahul", "karthik", "mahesh", "devasena", "kattapa" };

		Predicate<String> p1 = s -> s.length() < 6;
		
		for(String s1:names)
		{
			if(p1.test(s1))
			{
				System.out.println(s1);
			}
		}
		
	}
}
