package com.polymorphism;

class OldTv{
	
	public void screen()
	{
		System.out.println("lcd screen");
	}
	
	public void sound()
	{
		System.out.println("sound is good 560dz");
	}
	
	public void remote()
	{
		System.out.println("less options ");
	}
}
public class NewTv extends OldTv{

	@Override
	public void screen()
	{
		System.out.println("LED screen");
	}
	
	@Override
	public void remote()
	{
		System.out.println("nore options+network+ott ");
	}
	public static void main(String[] args) {
		
		NewTv nt= new NewTv();
		nt.screen();
		nt.remote();
		nt.sound();
	}
}
