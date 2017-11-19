package myPack2;

import org.junit.Test;
import common.utilities.LaunchCloseBrowser;

public class TC02 extends LaunchCloseBrowser{

	String url = "http://www.cricinfo.com";
	@Test
	public void atTest2() throws Exception{
		
		driver.get(url);
		System.out.println(driver.getTitle());
		
	}
	
}
