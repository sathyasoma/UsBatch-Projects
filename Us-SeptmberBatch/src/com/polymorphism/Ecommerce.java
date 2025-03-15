package com.polymorphism;

class PaymentMethod{
	
	//parent class method
	public void paymentMethod(double amount)
	{
		System.out.println("cash on delivery :"+amount);
	}
}

class CreditCardPayment extends PaymentMethod
{
	@Override  //child is overrided method from parent
	public void paymentMethod(double amount)
	{
		System.out.println("processing credit card payment :"+amount);
	}
}
class PayPalPayement extends PaymentMethod{
	
	@Override  //child is overrided method from parent
	public void paymentMethod(double amount)
	{
		System.out.println("processing pay pal payment :"+amount);
	}
}

public class Ecommerce {

	public static void main(String[] args) {
		
		CreditCardPayment cd= new CreditCardPayment();
		cd.paymentMethod(456.0);
		PayPalPayement pp= new PayPalPayement();
		pp.paymentMethod(678.0);
		
		
		
	}
}
