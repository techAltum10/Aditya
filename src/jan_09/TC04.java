package jan_09;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;

public class TC04 {

	//Dec WebDriver
	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		//Open Browser
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.naukri.com";
		
		driver.get(url);
	}
	
	@Test
	public void atTestGmail() throws Exception{
		
		//Select value from drop down when HTML-TAG is not select
		driver.findElement(By.name("qp")).sendKeys("java");
		driver.findElement(By.name("ql")).sendKeys("noida");
		
		new Select(driver.findElement(By.xpath("//input[@class = 'sdTxt w85']"))).selectByIndex(5);   //Should select 4
		
	}
	
	@After
	public void quitBrowser(){
		
	}
}









