package dec_26_1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.lift.find.InputFinder;
import org.openqa.selenium.support.ui.Select;

public class TC_05 {
	
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
	public void atTest() throws Exception{
		
		//Mouse Over on 'More'
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[text() = 'More']")));
		act.build().perform();
		Thread.sleep(1000);
		
		//Click on MCA
		driver.findElement(By.xpath("//a[text() = 'MCA']")).click();
	}
	
	@After
	public void quitBrowser(){
		
	}

}
