package com.rj.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test1 {

	Add t= new Add();
	
	int i=t.sum(120, 20);//140  actual value
	
	int j=160; //expected value
	
	@Test
	public void testSum() {
		
		System.out.println("sum is "+i +" ="+j);
		
		assertEquals(j,i);
		
	}

	}
