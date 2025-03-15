package com.demo.multi;

//logi1 class

class First{ //logic
	
	   public synchronized void display(String msg)
	   {
		   System.out.print("["+msg);
		   try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   System.out.print("]");
	   }
}
class Second extends Thread {
	
	String msg;
	First fobj; //has - a relation
	
	//param construtor to inilizae th logic
	public Second(First fobj,String msg)
	{
		this.msg=msg;
		this.fobj=fobj;
		this.start();//calling a thread(run method)
	}
	
	//call display method which is present inside the first class
	public void run()
	{
		fobj.display(msg);
	}
}

public class SynchDemo {

	public static void main(String[] args) {
		
		First fnew= new First();
		Second s1= new Second(fnew, "welcome");
		Second s2= new Second(fnew, "to");
		Second s3= new Second(fnew, "india");
		
		
	}
}
