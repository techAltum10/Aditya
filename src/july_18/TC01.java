package july_18;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC01 {

	WebDriver driver;
	String url;
	@Before
	public void atBefore(){
		//Open Browser
		driver = new FirefoxDriver();
		//driver = new ChromeDriver()
		
		driver.manage().window().maximize();
		url = "http://www.naukri.com";
	}
	
	@Test
	public void atTest() throws Exception{
	//TC Logic
		driver.get(url);
		
		//Enter Skills
		driver.findElement(By.name("qp")).sendKeys("Java");
		
		//Enter location
		driver.findElement(By.name("ql")).sendKeys("Delhi");
		
		//Click on Search
		driver.findElement(By.id("qsbFormBtn")).click();
		
	}
	
	@After
	public void atAfter(){
		driver.quit();
	}
}
