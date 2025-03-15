package com.demo.multi;

//threads priority
public class PriorityEx extends Thread{

	//child thread 
	public void run() //child thread createing
	{
		System.out.println("child thread priority:"+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		
		PriorityEx px= new PriorityEx(); //new state
		PriorityEx px1= new PriorityEx();
		px.setPriority(7);
		px.start();//calling run method internalliy:runnable
		px1.start();
		System.out.println("main thread priority :"+Thread.currentThread().getPriority());
	    Thread.currentThread().setPriority(10);
	System.out.println("after set prio:"+Thread.currentThread().getPriority());
	}
}
