package com.variables;

public class Vechile {

	int wheels=6;
	String engineOil="castraoil";
	
	public static void main(String[] args) {
		
		Vechile v= new Vechile();   //OBJECT CREATEION
		
		
		System.out.println("vechile wheels are :"+v.wheels);
		System.out.println("vechile oil is :"+v.engineOil);
	}
}
