package com.hospital;

public class Hospital {

	public static void main(String args[]){
		System.out.println("WELCOME....!");
		General obj=new General();
		obj.List();
		General doc=new Doctor();//polymorphism
		doc.check();
		doc.details();
		}

}
