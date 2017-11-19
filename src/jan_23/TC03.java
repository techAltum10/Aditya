package jan_23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TC03 {
	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.indianrail.gov.in/train_Schedule.html";
		
		driver.get(url);
	}
	
	@Test
	public void atTest() throws Exception{
		Thread.sleep(2000);
		
		
	}
	
	@After
	public void quitBrowser(){
		
	}

}
