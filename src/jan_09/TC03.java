package jan_09;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC03 {

	//Dec WebDriver
	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		//Open Browser
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.facebook.com";
		
		driver.get(url);
	}
	
	@Test
	public void atTestGmail() throws Exception{
		
		//Select value from drop down when HTML-TAG is select
		
		new Select(driver.findElement(By.id("day"))).selectByIndex(5);  //Should select 5
		
		new Select(driver.findElement(By.id("month"))).selectByValue("5");  //Should select May
		
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("1990");
	}
	
	@After
	public void quitBrowser(){
		
	}
}









