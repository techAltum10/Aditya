package aug_30;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NaukriTest {

	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.naukri.com/";
	}
	@Test
	public void atTest(){
		driver.get(url);
		
		new Select(driver.findElement(By.xpath("//input[@class = 'sdTxt w85']"))).selectByIndex(3);
	}
	@After
	public void closeBrowser(){
		
	}
	
}
