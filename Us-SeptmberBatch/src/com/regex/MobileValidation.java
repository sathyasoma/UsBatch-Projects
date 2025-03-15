package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileValidation {

	public static void main(String[] args) {
		
		Pattern p= Pattern.compile("[6-9][0-9]{9}");
		Matcher m= p.matcher(args[0]);
		
		if(m.find()&& m.group().equals(args[0]))
		{
			System.out.println("valid mobile number");
		}
		else {
			System.out.println("please enter valid number");
		}
	}
}
