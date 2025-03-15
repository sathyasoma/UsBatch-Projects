package com.Strings;

public class StringBufferMethods {
public static void main(String[] args) {
	
	
	StringBuffer sb= new StringBuffer("Capgemini");
    System.out.println(sb.append("india"));
    System.out.println(sb.insert(4, "sathya"));
    System.out.println(sb.replace(3, 7, "soma"));
    System.out.println(sb.delete(3, 6));
    System.out.println(sb.reverse());
    System.out.println(sb.capacity());
    sb.append("deveasena");
    System.out.println(sb.capacity());
   // sb.setLength(6);
   // System.out.println(sb);
    System.out.println(sb.substring(3));
    System.out.println(sb.substring(3,8));
    }
}
