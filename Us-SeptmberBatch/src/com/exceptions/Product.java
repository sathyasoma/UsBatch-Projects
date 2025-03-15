package com.exceptions;

class InvalidProductException extends Exception {

	// parma consctrutor
	public InvalidProductException(String message) {
		super(message);
	}
}

public class Product {
    
	private String productId;
	
	public Product(String productId) throws InvalidProductException {
		
		if(productId==null || productId.isEmpty())
		{
			throw new InvalidProductException("product id cant be null or empty :");
		}
		this.productId=productId;
	}
	
	//main method 
	
	public static void main(String[] args) throws InvalidProductException {
		
		Product p= new Product("197hsbvg");
		System.out.println("remaing 1000 lines of code");
		
	}
}
