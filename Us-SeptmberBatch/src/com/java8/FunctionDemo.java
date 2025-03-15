package com.java8;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		Function<Integer,Integer> f=i->i*i;
		System.out.println(f.apply(2));
		System.out.println(f.apply(4));
		System.out.println(f.apply(8));
		System.out.println(f.apply(16));
		System.out.println(f.apply(32));
		
		//passing string type of data getting oupt is integer 
		
		Function<String,Integer> f1=s->s.length();
		System.out.println(f1.apply("mahesh"));
		System.out.println(f1.apply("tarun"));
		System.out.println(f1.apply("karthik"));
		System.out.println(f1.apply("rahul"));
	}
}
