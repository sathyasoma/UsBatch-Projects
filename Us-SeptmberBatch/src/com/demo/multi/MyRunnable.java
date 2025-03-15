package com.demo.multi;


//class is implemnts with runnable interface(functional interface)

public class MyRunnable implements Runnable{
	
	@Override
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println("i am seetha thread:"+i);
		}	
	}
	
	public static void main(String[] args) {
		
		MyRunnable mr= new MyRunnable();
		
		//if u want to call runmethod we required start method
		Thread t= new Thread(mr); //objecte createion of Thread class
		t.start();
		
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("i am rama thread:"+i);
		}
	}

	
}
