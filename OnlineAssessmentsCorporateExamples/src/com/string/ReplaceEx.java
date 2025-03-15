package com.string;
//write a Java Program to replace lower-case characters with upper-case and vice-versa
public class ReplaceEx {

	 public static void main(String[] args) {    
         
	        String str1="SATHYA";    
	        StringBuffer newStr=new StringBuffer(str1);    
	            
	        for(int i = 0; i < str1.length(); i++) {    
	                
	            //Checks for lower case character    
	            if(Character.isLowerCase(str1.charAt(i))) {    
	                //Convert it into upper case using toUpperCase() function    
	                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    
	            }    
	            //Checks for upper case character    
	            else if(Character.isUpperCase(str1.charAt(i))) {    
	                //Convert it into upper case using toLowerCase() function    
	                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));    
	            }    
	        }    
	        System.out.println("String after case conversion : " + newStr);    
	    }    
}
