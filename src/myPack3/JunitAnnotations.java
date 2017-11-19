package myPack3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitAnnotations {
	
	@AfterClass
	public static void atAfterClass(){
		System.out.println("After Class");
	}
	
	
	
	@Before
	public void atBbefore(){
		System.out.println("Before");
	}
	
	@Test
	public void atTest1(){
		System.out.println("Test 1");
	}
	
	@Test
	public void atTest2(){
		System.out.println("Test 2");
	}
	
	@After
	public void atAfter(){
		System.out.println("After");
	}
	
	@BeforeClass
	public static void atBbeforeClass(){
		System.out.println("Before Class");
	}
	
}
