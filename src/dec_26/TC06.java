package dec_26;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC06 {

	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		//Open browser
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.naukri.com";
		
		driver.get(url);
		
	}
	
	@Test
	public void atTest(){

		//Enter Skills
		driver.findElement(By.name("qp")).sendKeys("Testing");
		driver.findElement(By.name("ql")).sendKeys("Gurgaon");
      		
		//Enter LOC
		
		
		//Select Exp
	}
	
	@After
	public void quitBrowser(){
		//driver.quit();
	}
	
}






