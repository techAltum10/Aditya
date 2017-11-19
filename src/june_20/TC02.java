package june_20;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TC02 {

	WebDriver driver;
	String url;
	
	@Test
	public void atTest() throws Exception{
		driver.get(url);
		Thread.sleep(2000);
		
		driver.findElement(By.id("InpBx1")).sendKeys("Delhi");
		
	}
	
	@After
	public void closeBrowser(){
		
	}
	
	@Before
	public void launchBrowser(){
		//driver = new FirefoxDriver();
		
		System.setProperty("webdriver.ie.driver", "D:\\Selenium_Files\\IE_Driver_64_bit\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		
		url = "http://in.bookmyshow.com/";
		/*
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();*/
	}
}
