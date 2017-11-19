package dec_26;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC04 {

	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		//Open browser
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "https://www.myhcl.com/Login/home.aspx";
		
		driver.get(url);
		
	}
	
	@Test
	public void atTest(){

		//If HTML TAG is SELECT of a drop down
		
		//new Select(driver.findElement(By.id("ddlDomain"))).selectByIndex(2);  //Should select HCL Tech
	
		//new Select(driver.findElement(By.id("ddlDomain"))).selectByValue("GEO");
		
		new Select(driver.findElement(By.id("ddlDomain"))).selectByVisibleText("HCLISD");
	}
	
	@After
	public void quitBrowser(){
		//driver.quit();
	}
	
}






