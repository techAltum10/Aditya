package nov_15;

import org.testng.annotations.Test;

public class TC01 extends LCB{

	@Test
	public void atTest01(){
		driver.get("http://www.google.com");	
		
		System.out.println(driver.getTitle());
	}
}
