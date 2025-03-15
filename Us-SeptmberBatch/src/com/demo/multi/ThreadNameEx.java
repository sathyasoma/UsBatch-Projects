package com.demo.multi;

public class ThreadNameEx extends Thread{ //class extends with thread class
   	
	//child thread name
	public void run()
	{
		System.out.println("child thread name :"+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		ThreadNameEx tt= new ThreadNameEx();
		ThreadNameEx tt1= new ThreadNameEx();
		tt.setName("keerthi");
		tt.start();//calling the run method internally
		tt1.start();
		
		//main thread name
		System.out.println("Main thread name :"+Thread.currentThread().getName());
		Thread.currentThread().setName("sathya");//setting name sathya
		System.out.println("after set Main thread name :"+Thread.currentThread().getName());
	}
}
