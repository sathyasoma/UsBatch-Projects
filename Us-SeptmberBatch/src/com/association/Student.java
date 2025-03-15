package com.association;

public class Student {

	String name;
	int age;
	Adress add; //has a relation

	public Student(String name,int age,Adress add)
	{
		this.age=age;
		this.name=name;			
		this.add=add;
	}
	
	public void showInfo()
	{
		System.out.println("Student name :"+name);
		System.out.println("Student age :"+age);
		System.out.println("address:"+add);
		
	}
	public static void main(String[] args) {
		
		Adress add= new Adress(123,"saraswathu","tg",9089);
		Student st= new Student("sathya",30,add);
		st.showInfo();
		add.showAddress();
	}
}
