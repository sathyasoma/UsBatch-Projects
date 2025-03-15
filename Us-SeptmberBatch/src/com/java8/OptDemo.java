package com.java8;

import java.util.Optional;

public class OptDemo {
public static void main(String[] args) {
	
	
	Optional<String> name=Optional.of("sathya");
	String ans1="yes";
	String ans2=null;
	
	System.out.println(name);
	System.out.println(name.get());
	System.out.println(Optional.empty());
	
	System.out.println(Optional.ofNullable(ans1));
	System.out.println(Optional.ofNullable(ans2));
	System.out.println(Optional.of(ans2));//null pointer ex
}
}
