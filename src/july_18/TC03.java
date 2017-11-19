package july_18;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TC03 {

	WebDriver driver;
	String url;
	
	@Before
	public void atBefore(){
		//Open Browser
		driver = new FirefoxDriver();
		driver.manage().window().maximize();  //Max win
		
		//Dec URL
		url = "http://www.snapdeal.com/";
	}
	@Test
	public void atTest() throws Exception{
		driver.get(url);
		Thread.sleep(2000);
		
		//Mouse over on Mobile and Tablets
		Actions actMobTab = new Actions(driver);
		actMobTab.moveToElement(driver.findElement(By.xpath("//span[text() = 'Mobiles & Tablets']")));
		actMobTab.build().perform();
		Thread.sleep(1000);
		
		//Mouse Over on Tablets
		Actions actMob = new Actions(driver);
		actMob.moveToElement(driver.findElement(By.xpath("//span[text() = 'Mobiles']")));
		actMob.build().perform();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text() = 'iPhone']")).click();
	}
	
	@After
	public void atAfter(){
		
	}
}
