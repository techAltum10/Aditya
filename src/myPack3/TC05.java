package myPack3;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC05 {
	
	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		url = "http://www.naukri.com";
	}
	
	@Test
	public void atTest(){
		
		driver.get(url);
		
		String exp_title = "naukri";
		System.out.println("Exp value is :  "+ exp_title);
		
		String act_title = driver.getTitle();
		System.out.println("Act title is : " + act_title);
		
		/*if(exp_title.equals(act_title)){
			System.out.println("Equal");
		}
		else{
			System.out.println("Not equal");
		}*/
		
		Assert.assertEquals(exp_title, act_title);
	}
	
	@After
	public void closeBrowser(){
		driver.quit();
	}

}
