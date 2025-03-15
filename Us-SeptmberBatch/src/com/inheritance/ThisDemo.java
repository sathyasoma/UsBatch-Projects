package com.inheritance;

class SuperDemo{
	
	int salary=40000;
	
	public void getSalary(int salary)
	{
		salary=50000;
		System.out.println("my parent local salary is :"+salary);
	}	
}
public class ThisDemo extends SuperDemo{

	int salary=10000;
	
	public void getSalary(int salary)	
	{
		salary=30000;
		System.out.println("my local salary  is :"+salary);
		System.out.println("my global salary  is :"+this.salary);
		this.display();
		System.out.println("my class address is:"+this);
		super.getSalary(60000);
		System.out.println("my parent global slary :"+super.salary);
	}
	
	public void display()
	{
		System.out.println("i am dispalsy method the current classa");
	}
	public static void main(String[] args) {
		
		ThisDemo th= new ThisDemo();
		th.getSalary(20000);
	
		//System.out.println(th);//object addres in hexamdecimal format
		
	}
}
