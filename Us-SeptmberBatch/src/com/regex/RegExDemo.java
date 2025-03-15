package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		int count=0;
		
		Pattern p= Pattern.compile("b*");
		Matcher m=p.matcher("aabA ab3xaaaaaRbbg dd6hdbGaaaababy7 abYaaag8bab");
		
		while(m.find())
		{
			count++;
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		System.out.println("the no of occurences are:"+count);
	}
}
