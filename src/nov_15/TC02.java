package nov_15;

import org.testng.annotations.Test;

public class TC02 extends LCB{

	@Test
	public void atTest02(){
		driver.get("http://www.gmail.com");	
		
		System.out.println(driver.getTitle());
	}
}
