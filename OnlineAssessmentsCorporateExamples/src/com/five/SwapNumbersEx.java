package com.five;

/*We can’t return multiple variables in Java. 
Since Java is Pass-by-Value and these are primitive data types, their values won’t change. 
For example, below swap function will not change the input integer values.*/




//How to swap two numbers without using a third variable?
public class SwapNumbersEx {
	public static void swapNumbers(int a, int b) {
	    b = b + a;
		a = b - a;
		b = b - a;
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		swapNumbers(a, b);
		System.out.printf("a is %d, b is %d", a, b); // a is 10, b is 20
	}

}
