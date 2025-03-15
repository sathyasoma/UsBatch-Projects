package Annotations;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Test1 {

	@Before
	public void m1() {
		System.out.println("executes before each @Test case");
	}
	
	@BeforeClass
	public static void m2() {
		System.out.println("executes only one time and first");
	}
	
	@Test
	public void m3() {
		
		System.out.println("Test case 1");
	}
	
	@After
	public void m4() {
		System.out.println("executes after each  @Test case");
	}
	
	@AfterClass
	public static void m5() {
		System.out.println("executes only one time and last");
	}
	
	@Test
	public void m6() {
		System.out.println("test case 2");
	}
	
	@Ignore
	public void m7() {
		System.out.println("it will ignore by junit compiler");
	}
}
