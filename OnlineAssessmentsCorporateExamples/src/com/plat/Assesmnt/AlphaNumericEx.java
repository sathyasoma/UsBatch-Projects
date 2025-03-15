package com.plat.Assesmnt;

/*
 * Write a function to return the count of  alphanumeric characters in a 
 * given string.(Count number of alphabets and numerics in a string)
*/
class AlphaNumericEx {
	public static void main(String[] args) {
		System.out.println(solve("Hello World!123"));
	}

	public static int solve(String str) {
		int count = 0;
		char[] str1 = str.toCharArray();
		for (int i = 0; i < str1.length; i++) {
			if ((str1[i] >= 'A' && str1[i] <= 'Z') || (str1[i] >= 'a' && str1[i] <= 'z'))
				count++;
			if (str1[i] >= '0' && str1[i] <= '9')
				count++;
		}
		return count;
	}
}
