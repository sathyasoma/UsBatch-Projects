package com.controls;

public class Restaurent {
public static void main(String[] args) {
	
	String feedback="not avg";
	
	if(feedback=="wrost")
	{
		System.out.println("food is wrost better u can leave");
	}
	else if(feedback=="avg")
	{
		System.out.println("food is normal better to improve");
	}
	else if(feedback=="good")
	{
		System.out.println("food is good you may get a tip");
	}
	else if(feedback=="excellent"){
		System.out.println("you may get incremnt");
	}
	else {
		System.out.println("please enter valid feedback");
	}
}
}
