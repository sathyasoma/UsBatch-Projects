package com.mcq;

/*In the Integer class, the MIN_VALUE is negative (i.e. -231),
both the MAX_VALUE and MIN_VALUE of the Double class are positive numbers. 
The Double.MIN_VALUE is 2-1074, a double constant whose magnitude is the 
least among all double values.

So, unlike the noticeable answer, 
this program will print 0.0 because of Double.MIN_VALUE is greater than 0.*/















public class Test7 {
	public static void main(String args[])  
	{  
		
		Test7 t= new Test7();
	System.out.println(Math.min(Double.MIN_VALUE, 0.0d)); 
	
	}  
}

//0
//0.0
//Null
//ArithmaticException
//Compilation Error







