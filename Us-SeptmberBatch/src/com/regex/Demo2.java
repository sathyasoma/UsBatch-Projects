package com.regex;

import java.util.regex.Pattern;

public class Demo2 {

	public static void main(String[] args) {
		
		
		Pattern p= Pattern.compile("[.]");
		String[] s=p.split("www.sathysoma.com");
		
		for(String s1:s)
		{
			System.out.println(s1);
		}
	}
}
