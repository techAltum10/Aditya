package myPack3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC01 {
	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		
		driver = new FirefoxDriver();
		
		url = "http://www.gmail.com";
		
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void atTest(){
		
		driver.get(url);
		
		driver.findElement(By.id("Email")).sendKeys("UserName1");
		
		driver.findElement(By.name("Passwd")).sendKeys("abc123");
		
		driver.findElement(By.name("signIn")).click();
		
	}
	
	@After
	public void atAfter(){
		driver.quit();
	}
	

}
