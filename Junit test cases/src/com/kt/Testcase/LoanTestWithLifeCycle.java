package com.kt.Testcase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.kt.test.Loan;

class LoanTestWithLifeCycle {
     Loan obj;   //make it gloabla variable use any where in the class
	
	@BeforeAll // if you want write any data before u start test
	static void setUpBeforeClass() throws Exception {
		System.out.println("before test case");
	}

	@AfterAll //if you want write any data after  test
	static void tearDownAfterClass() throws Exception {
		System.out.println("after test case");
	}

	@BeforeEach //we writting actual data for testing logic
	void setUp() throws Exception {
		
		 obj= new Loan();
	}

	@AfterEach  //after closing all completing testclear the memory for objecct thats why 
	                  //we make it object should be null
	void tearDown() throws Exception {
		
		obj= null;
	}

	@Test
	void testgetEmi() {
		
		
		/*
		 * int emi=obj.getEmi(60000); assertEquals(5000,emi);
		 */
		 
		// other way to do test
		
		assertEquals(5000,obj.getEmi(60000));
		//to test other tets
		String s=null; 
	//	assertNull(s); //it will check string is null or not(given string is null: test case passed)
		
		//assertNotNull(s); //test fails
	}
	@Test
	void testshow() {
		//fail("not yet implemented");
		assertEquals("welcome",obj.show());
		
	}

}
