package dec_26;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC05 {

	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		//Open browser
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.facebook.com";
		
		driver.get(url);
		
	}
	
	@Test
	public void atTest(){

		//Select DAY
		new Select(driver.findElement(By.id("day"))).selectByIndex(5);
		
		
		//Select Month
		new Select(driver.findElement(By.id("month"))).selectByValue("4");
		
		//Select Year
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("1990");
	}
	
	@After
	public void quitBrowser(){
		//driver.quit();
	}
	
}






