package com.kt.Testcase;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.kt.test.Loan;

class LoanTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		
		Loan obj= new Loan();
		
		int emi=obj.getEmi(60000);
		assertEquals(6000,emi);
	}

	

	
}
