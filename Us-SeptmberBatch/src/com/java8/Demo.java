package com.java8;

@FunctionalInterface
interface Test{
	public void engine();
}
//class Result implements Test{
//
//	@Override
//	public void engine() {
//		System.out.println("the engine has 1000cc..");		
//	}		
//}
public class Demo {

	public static void main(String[] args) {

	Test t=	()->{System.out.println("the engine has 1000cc..");};
	t.engine();
	}
}
