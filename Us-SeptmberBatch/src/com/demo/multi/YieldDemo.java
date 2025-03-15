package com.demo.multi;

public class YieldDemo extends Thread{
	
	//child thread
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println("child Thread :"+i);
			Thread.yield();//1st
		}
	}
public static void main(String[] args) {
	
	YieldDemo yd= new YieldDemo();
	yd.start();//calling run method
	
	for(int i=0;i<=10;i++)
	{
		System.out.println("main Thread :"+i);
	}
}
}
