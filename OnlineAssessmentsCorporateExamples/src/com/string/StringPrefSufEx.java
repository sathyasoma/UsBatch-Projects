package com.string;

import java.io.IOException;

public class StringPrefSufEx {
	// Returns a string which contains first l
	// characters of 'a' and last l characters of 'b'.
	public static String prefixSuffix(String a, String b, int length) {
		// Calculating prefix of first
		// string of given length
		String prefix = a.substring(0, length);
		
		int lb = b.length();

		// Calculating suffix of second
		// string of given length
		String suffix = b.substring(lb - length);
		
		return (prefix + suffix);
	}

	// Driver code
	public static void main(String args[]) throws IOException {
		String a = "sathya", b = "swamysoma";
		int l = 5;
		System.out.println(prefixSuffix(a, b, l));
	}
}
