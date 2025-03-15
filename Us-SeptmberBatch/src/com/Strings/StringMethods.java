package com.Strings;

public class StringMethods {
 public static void main(String[] args) {
	
	 String name="Capgemini";
	 
	 System.out.println(name.charAt(0));
	 System.out.println(name.charAt(8));
	 System.out.println(name.codePointAt(1));
	 System.out.println(name.codePointBefore(2));
	 System.out.println(name.compareTo("Capgemini"));
	 System.out.println(name.contains("mini"));
	 System.out.println(name.contains("sathya"));
	 System.out.println(name.endsWith("i"));
	 System.out.println(name.hashCode());
	 System.out.println(name.indexOf('a'));
	 System.out.println(name.indexOf('i'));//1st
	 System.out.println(name.indexOf('i'));//last i
	 System.out.println(name.lastIndexOf('i'));
	 System.out.println(name.isEmpty());
	 System.out.println(name.length());
	 System.out.println(name.replace("Capgemini", "welcome to india"));
	 System.out.println(name.toUpperCase());
	 System.out.println(name.toLowerCase());
}
}
