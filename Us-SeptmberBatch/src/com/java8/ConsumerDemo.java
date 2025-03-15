package com.java8;

import java.util.function.Consumer;

//take theinput will not retrun anything
public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<String> c=s->System.out.println(s);
		
		c.accept("karthik");
		c.accept("rahul");
		c.accept("mahesh");
	}
}
