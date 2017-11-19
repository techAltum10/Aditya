package july_18;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC06 {
	
	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		//Open Browser
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.naukri.com";
		
		driver.get(url);
	}
	
	@Test
	public void atTest() throws Exception{
		
		driver.findElement(By.name("qp")).sendKeys("Selenium");
		
		driver.findElement(By.name("ql")).sendKeys("Noida");
		
		driver.findElement(By.id("qsbFormBtn")).click();
		
		Thread.sleep(2000);
	
		//HTML-Code[@att = 'val']
		
		String jobs = driver.findElement(By.xpath("//h1[@class = 'small_title']")).getText();
		
		System.out.println(jobs);
	}
	
	@After
	public void closeBrowser(){
		
	}

}
