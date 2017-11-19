package june_20;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TC03 {

	@BeforeClass
	public static void atBeforeClass(){
		System.out.println("Before Class");
	}
	
	@Before
	public void atBefore(){
		System.out.println("Before");
	}
	
	@After
	public void atAfter(){
		System.out.println("After");
	}
	
	@AfterClass
	public static void atAfterClass(){
		System.out.println("After Class");
	}
	
	@Ignore
	@Test
	public void atTest1(){
		System.out.println("Test 1");
	}
	
	@Test
	public void atTest2(){
		System.out.println("Test 2");
	}
}
