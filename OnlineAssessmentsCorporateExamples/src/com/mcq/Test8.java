package com.mcq;

/*We know that the static block executed first. 
Therefore, the post decrement value of x will be 1111 and the pre decrement 
value will be 1109 and the difference between the values is 2 and the same will
print on the console. Note that the block after the static block will never get 
executed.(b)*/


















public class Test8 {
	static int x=1111;  
	static  
	{  
	x=x-- - --x;  
	}  
	{  
	x=x++ + ++x;  
	}  
	public static void main(String args[])  
	{  
	System.out.println(x);  		
	}  
}
//1
//2
//1110
//1109
//11
