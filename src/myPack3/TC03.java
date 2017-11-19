package myPack3;

import org.junit.Ignore;
import org.junit.Test;

import common.utilities.LaunchCloseBrowser;

public class TC03 extends LaunchCloseBrowser{

	String url = "http://www.google.com";
	
	@Ignore
	@Test
	public void atTest2() throws Exception{
		
		driver.get(url);
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
}