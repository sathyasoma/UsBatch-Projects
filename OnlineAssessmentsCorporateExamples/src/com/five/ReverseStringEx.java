package com.five;

/*It might be surprising, but there is no reverse() utility method in the String class. 
But, it’s a very simple task. We can create a character array from the string and then 
iterate it from the end to start. We can append the characters to a string builder and 
finally return the reversed string.*/















//How to reverse a String in Java?
public class ReverseStringEx {

	public static void main(String[] args) {

		String str = "sathya";
		System.out.println(reverse(str));
	}

	public static String reverse(String in) {
		if (in == null)
			throw new IllegalArgumentException("Null is not valid input");

		StringBuilder out = new StringBuilder();

		char[] chars = in.toCharArray();

		for (int i = chars.length - 1; i >= 0; i--)
			out.append(chars[i]);

		return out.toString();
	}
}
