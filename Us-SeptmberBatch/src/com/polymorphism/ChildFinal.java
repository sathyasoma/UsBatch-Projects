package com.polymorphism;

 class ParentFinal{ //final classes cant exetends
	
      int age=77; //final variable cant modify
	
	public  void getAge(int age) //finla methods cant override
	{
		this.age=++age;
		System.out.println("my parent age is :"+this.age);
	}	
}
public class ChildFinal extends ParentFinal{

	@Override
	public void getAge(int age)
	{
		this.age=--age;
		System.out.println("my child age is :"+this.age);
	}
	
	public static void main(String[] args) {
		
		ChildFinal cf= new ChildFinal();
		cf.getAge(88);//77 76 78 87 88 89
	}
}
