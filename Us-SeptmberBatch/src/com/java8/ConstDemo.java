package com.java8;

class Sample{
	public Sample(String s) {
		System.out.println("sample class Constrcuor"+s);
	}
}

interface Inter{
	
	public Sample get(String s);
}

public class ConstDemo {

	public static void main(String[] args) {
		
		
		Inter i=Sample::new;
		Sample s1=i.get("sathya");
		//System.out.println(s1);
	}
	
}
