package aug_30;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MyHCL {

	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "https://www.myhcl.com/Login/home.aspx";
	}
	@Test
	public void atTest(){
		driver.get(url);
		
		new Select(driver.findElement(By.id("ddlDomain"))).selectByValue("HCLTECH");
		
	}
	@After
	public void closeBrowser(){
		
	}
	
}
