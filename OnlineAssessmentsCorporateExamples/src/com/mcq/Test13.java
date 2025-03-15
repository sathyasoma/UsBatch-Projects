package com.mcq;

/*ArrayStoreException is a runtime exception. 
Array must contain the same data type elements. 
It exception is thrown to indicate that an attempt 
has been made to store the wrong type of object into an array of objects. 
In other words, if you want to store the integer Object in an Array of String you will get ArrayStoreException.(b)*/

























public class Test13 {

	 public static void main(String args[]) {  
	       Object x[] = new String[3];  
	         x[0] = new Integer(0);  
	    }  
}

//ArrayIndexOutOfBoundsException
//ArrayStoreException
//NegativeArraySizeException
//NullPointerException
//ClassCastException






