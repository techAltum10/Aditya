package sept_26;

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
		//Open Browser
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.flipkart.com";
		driver.get(url);
	}
	
	@Test
	public void atTest() throws Exception{
		//Test Box
		if(driver.findElement(By.id("fk-top-search-box")).isEnabled()){
			System.out.println("Text Box is enabled");
			
			//Enter Search String
			driver.findElement(By.id("fk-top-search-box")).sendKeys("Shirt");
		}else{
			System.out.println("Text Box is disabled");
		}
		
		//Button
		if(driver.findElement(By.xpath("//input[@class = 'search-bar-submit fk-font-13 fk-font-bold']")).isEnabled()){
			System.out.println("Search button is enabled.");
			
			//Click
			driver.findElement(By.xpath("//input[@class = 'search-bar-submit fk-font-13 fk-font-bold']")).click();
			
		}else{
			System.out.println("Search is disabled.");
		}
		
		Thread.sleep(2000);
		
		//Capture total items
		//String s = driver.findElement(By.id("searchCount")).getText();
		String s = driver.findElement(By.xpath("//span[@class = 'items']")).getText();
		System.out.println(s);
		
		//driver.getwin
	}
	
	@After
	public void closeBrowser(){
		//driver.quit();
	}

}
