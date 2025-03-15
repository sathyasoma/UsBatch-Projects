package acom.abstraction;

//Abstratc class for Order
abstract class Order{
	
	public abstract double calculateOrder(); //100%
}
//concrete class for Delivery order
class DeliveryOrder extends  Order{
	
	double delivertyCharge=89.0;
	double orderAmount=790.0;
	
	@Override
	public double calculateOrder() {
	
		return delivertyCharge+orderAmount;
	}	
}
//concrete class for DininOrder
class DininOrder extends Order{
	
	double orderAmount=890.0;
	double serviceCharge=10.0;
	
	@Override
	public double calculateOrder() {
	
		return orderAmount+serviceCharge;
	}	
}

public class FoodDelivary {

	public static void main(String[] args) {
		
		Order dorder= new DeliveryOrder();
		System.out.println("Delivey order: "+dorder.calculateOrder());
		
		Order did= new DininOrder();
		System.out.println("Dinin ORDER" +did.calculateOrder());
	}
}
