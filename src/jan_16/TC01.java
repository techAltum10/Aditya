package jan_16;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TC01 {

	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		//Open Browser : FF
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.naukri.com";
		
		driver.get(url);
	}
	
	@Test
	public void atTest() throws Exception{
		//TC Start
		Thread.sleep(2000);
		
		//Mouse over : More : 
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[text() = 'More']")));
		act.build().perform();   //Note this point
		Thread.sleep(1000);
		
		//click on MCA
		driver.findElement(By.xpath("//a[text() = 'MCA']")).click();
	}

	@After
	public void quitBrowser(){
		
	}
}












