package dec_26;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC02 {

	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		//Open browser
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.facebook.com";
		
		driver.get(url);
		
	}
	
	@Test
	public void atTest(){

/*if 	(driver.findElement(By.id("u_0_e")).isSelected())
	System.out.println("Male radio button is not selected ");

else (driver.findElement(By.id("u_0_e")).click());
System.out.println("Male radio button is selected now");

if (driver.findElement(By.id("u_0_e")).isSelected();
System.out.println("male ");*/
		
		if(driver.findElement(By.id("u_0_e")).isSelected()){
			System.out.println("Selected");
		}
		else{
			System.out.println("Not Selected");
			
			//Click to Select
			driver.findElement(By.id("u_0_e")).click();
		}
		
		//Check if it selected
		if(driver.findElement(By.id("u_0_e")).isSelected()){
			System.out.println("Selected now");
		}
		else{
			System.out.println("Still Not Selected");
			
		}
	}
	
	@After
	public void quitBrowser(){
		//driver.quit();
	}
	
}






