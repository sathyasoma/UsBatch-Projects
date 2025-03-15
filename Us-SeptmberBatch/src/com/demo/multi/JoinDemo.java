package com.demo.multi;

public class JoinDemo extends Thread{

	//child thread
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("child thread...."+i);
			try {
				Thread.sleep(3000);//12
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		JoinDemo jd= new JoinDemo();
		jd.start();//caling run method
		//jd.join();
		jd.join(10000); //10s
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("main thread..."+i);
		}
	}
}
