package myPack3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC04 {
	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		
		driver = new FirefoxDriver();
		
		url = "http://www.google.com";
		
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void atTest() throws Exception{
		
		driver.get(url);
		
		driver.findElement(By.id("lst-ib")).sendKeys("JAVA");
		
		Thread.sleep(2000);
		
		//Arrow down
		
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(2000);
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(2000);
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ARROW_DOWN);
	}
	
	@After
	public void atAfter(){
		driver.quit();
	}
	

}
