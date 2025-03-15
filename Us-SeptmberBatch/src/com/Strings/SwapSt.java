package com.Strings;

public class SwapSt {
public static void main(String[] args) {
	String str="bahubali";
	String str1="devasena";
	System.out.println("before swap  string1:"+str);
	System.out.println("before swap  string2:"+str1);
	
	str=str+str1;
	
	str1=str.substring(0,str.length()-str1.length());
	str=str.substring(str1.length());
	
	SwapSt.demo(str, str1);
	
}

public static void demo(String str,String str1)
{
	 System.out.println("after swaping :string 1"+str);
	 System.out.println("afyter swapping strring2 :"+str1);
}

}
