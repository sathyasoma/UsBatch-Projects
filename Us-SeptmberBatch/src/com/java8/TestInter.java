package com.java8;


interface Interf{
	
	public void add(int a,int b);
}
public class TestInter {
   
	public static void sum(int a,int b)
	{
		System.out.println("sum is  :"+(a+b));
	}
	public static void main(String[] args) {
//if we dont have any implemntation will go for lamda		
		Interf i=(a,b)->System.out.println("sum is :"+(a+b));
		i.add(100, 200);
//if we have any impl will gof or refrence		
		Interf i1=TestInter::sum;
		i1.add(100, 200);
	}
}
