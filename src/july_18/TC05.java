package july_18;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC05 {
	
	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		//Open Browser
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.google.com";
		
		driver.get(url);
	}
	
	@Test
	public void atTest(){
		driver.findElement(By.id("lst-ib")).sendKeys("Java");
		
		driver.findElement(By.name("btnG")).click();
	}
	
	@After
	public void closeBrowser(){
		
	}

}
