package nov_15;

import org.testng.annotations.Test;

public class TC03 extends LCB{

	@Test
	public void atTest03(){
		driver.get("http://www.gmail.com");	
		
		System.out.println(driver.getTitle());
	}
}
