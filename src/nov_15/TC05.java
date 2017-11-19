package nov_15;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TC05 {
	
	WebDriver driver;
	String url;
	
	@Before  //Before Act
	public void launchBrowser(){
		//Open Browser
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.naukri.com";
		
		driver.get(url);
		
	}
	
	@Test  //TC Logic
	public void atTest(){
		
		
	}
	
	@After
	public void quitBrowser(){
		driver.quit();
	}

}
