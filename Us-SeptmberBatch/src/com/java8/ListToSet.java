package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToSet {

	public static void main(String[] args) {
		
		List<Product> products= new ArrayList();
		
		products.add(new Product(1, "car", 45689f));
		products.add(new Product(2, "bus", 568f));
		products.add(new Product(3, "laptop", 123f));
		products.add(new Product(4, "mobile", 6000f));
		products.add(new Product(5, "harger", 1222f));
		products.add(new Product(6, "keypad", 7888f));
		
		System.out.println(products);
		
		//converting list to set
	Set<Float> setProducts=	products.stream().filter(product -> product.getPprice()<15000)
		 .map(product->product.getPprice()).collect(Collectors.toSet());
		
	System.out.println(setProducts);	
		
	}
}
