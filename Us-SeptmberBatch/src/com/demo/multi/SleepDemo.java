package com.demo.multi;

public class SleepDemo extends Thread {
  
	public void run()
	{
		for(int i=0;i<=10;i++) {
		System.out.println("slide show :"+i);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	public static void main(String[] args) { //main thread :1 year
		
		SleepDemo sd= new SleepDemo();//thread1
		sd.start();//calling run method
		//sd1.start();
		
		
	}
}
