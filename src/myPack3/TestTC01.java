package myPack3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestTC01 {
	
	//Var dec
	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		//Open a browser
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.google.com";
	}
	
	@Test
	public void atTest(){
		driver.get(url);
		
		driver.findElement(By.id("gbqfq")).sendKeys("Selenium");
		
		driver.findElement(By.name("btnG")).click();
		
		String pageUrl = driver.getCurrentUrl();
		
		System.out.println(pageUrl);
		
		
	}
	
	@After
	public void ucloseBrowser(){
		//driver.quit();
	}

}
