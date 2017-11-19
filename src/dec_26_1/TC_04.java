package dec_26_1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.lift.find.InputFinder;
import org.openqa.selenium.support.ui.Select;

public class TC_04 {
	
	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
	
		//driver = new FirefoxDriver();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.get("http://www.naukri.com");
	   
	}
	
	@Test
	public void atTest(){
		
		driver.findElement(By.name("qp")).sendKeys("Java");
		driver.findElement(By.name("ql")).sendKeys("Noida");
		
		//Tab  : Exp
		driver.findElement(By.name("ql")).sendKeys(Keys.TAB);
		
		//Arrow down
		driver.findElement(By.xpath("//input[@class = 'sdTxt w85']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@class = 'sdTxt w85']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@class = 'sdTxt w85']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@class = 'sdTxt w85']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@class = 'sdTxt w85']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@class = 'sdTxt w85']")).sendKeys(Keys.ARROW_DOWN);

	}
	
	@After
	public void quitBrowser(){
		
	}

}
