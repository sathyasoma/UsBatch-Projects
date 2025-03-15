package com.Strings;

public class StringBufferDemo {
public static void main(String[] args) {
	
	
	StringBuffer sb= new StringBuffer("Capgemini");
	StringBuffer sb1= new StringBuffer("Capgemini");
	      // sb.append("india");//mutable
	//System.out.println(sb);
	
	System.out.println(sb==sb1);//t f
	System.out.println(sb.equals(sb1));//t f
}
}
