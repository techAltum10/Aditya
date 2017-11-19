package jan_09;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC02 {

	//Dec WebDriver
	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		//Open Browser
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.facebook.com";
		
		driver.get(url);
	}
	
	@Test
	public void atTestGmail() throws Exception{
		
		if(driver.findElement(By.id("u_0_d")).isSelected()){
			System.out.println("Female radio is selected");
		}
		else{
			System.out.println("Female Radio is not selected");
		}
	}
	
	@After
	public void quitBrowser(){
		
	}
}









