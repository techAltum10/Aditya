package myPack2;

import org.junit.Test;
import common.utilities.LaunchCloseBrowser;

public class TC01 extends LaunchCloseBrowser{

	String url = "http://www.gmail.com";
	@Test
	public void atTest1() throws Exception{
		
		driver.get(url);
		System.out.println(driver.getTitle());
		
	}
	
}
