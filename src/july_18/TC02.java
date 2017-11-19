package july_18;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC02 {

	WebDriver driver;
	String url;
	
	@Before
	public void atBefore(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://in.bookmyshow.com/";
	}
	@Test
	public void atTest() throws Exception{
		driver.get(url);
		Thread.sleep(8000);
		
		driver.switchTo().frame(driver.findElement(By.id("wiz-iframe")));
		
		driver.findElement(By.cssSelector("a.wzrkClose")).click();
		
	}
	
	@After
	public void atAfter(){
		
	}
}
