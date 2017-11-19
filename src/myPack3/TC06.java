package myPack3;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TC06 {
	
	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		url = "http://www.naukri.com";
	}
	
	@Test
	public void atTest() throws Exception{
		
		driver.get(url);
		
		Thread.sleep(3000);
		
		//Mouse Over on MORE
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//div[text() = 'More']")));
		act.build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text() = 'MBA']")).click();
	}
	
	@After
	public void closeBrowser(){
		//driver.quit();
	}

}
