package com.demo.multi;

//class is extends with thread class
public class MyThread extends Thread{
	 
	public void run()//child thread
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("i am child thread :"+i);
		}
	}	
	
	public static void main(String[] args) {
		
		MyThread mt= new MyThread();
		//mt.run(); //normal method calling
		mt.start(); //this method will call run method
		
		for(int i=0;i<=10;i++)   //main thread
		{
			System.out.println("i am main thread :"+i);
		}
	}

}
