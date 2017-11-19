import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class JUnitAnnotations {

	@Before
	public void atBefore(){
		System.out.println("Before");
	}
	
	@Test
	public void atTest01(){
		System.out.println("Test 01");
	}
	
	//@Ignore
	@Test
	public void atTest02(){
		System.out.println("Test 02");
	}
	
	@After
	public void atAfter(){
		System.out.println("After");
	}
	
	@AfterClass
	public static void atAfterClass(){
		System.out.println("After Class");
	}
	
	@BeforeClass
	public static void atBeforeClass(){
		System.out.println("Before Class");
	}
}
