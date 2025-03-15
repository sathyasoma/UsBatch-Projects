package com.java8;

import java.util.Optional;

public class OptMethods {

	//it is printing non-null vlayue
	public static void isPresentEx()
	{
		Optional<String> opt= Optional.of("sathya");
		System.out.println(opt.isPresent());
		
	}
	
	public static void createEmpty()
	{
		Optional<String> emt=Optional.empty();
		System.out.println(emt.isPresent());
	}
	
	public static void createOfDemo()
	{
		String name="soma";
		Optional.of(name);
	}
	
	//error
	public static void main(String[] args) {
		
		//OptMethods.isPresentEx();
		//OptMethods.createEmpty();
		OptMethods.createOfDemo();
		ifPresentDemo();
	}
	
	private static void ifPresentDemo()
	{
		String name="sathya";
		if(name!=null)
		{
			System.out.println(name.length());
		}
		
//		Optional<String> opt=Optional.of("keerthi");
//		opt.ifPresent(str->System.out.println(str.length()));
	}
}
