package dec_26;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC01 {

	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		//Open browser
		driver = new FirefoxDriver();
		
		/*System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Files\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();*/
		driver.manage().window().maximize();
		
		url = "http://www.facebook.com";
		
		driver.get(url);
		
	}
	
	@Test
	public void atTest(){
		
		//Check if First name text box is displayed or not
		if(driver.findElement(By.id("u_0_1")).isDisplayed()){
			System.out.println("First Name text box is displayed");
			
			//Check if it is enable or not
			if(driver.findElement(By.id("u_0_1")).isEnabled()){
				System.out.println("First name text box is enabled");
				
				//Enter first name
				driver.findElement(By.id("u_0_1")).clear();
				driver.findElement(By.id("u_0_1")).sendKeys("Demo Name");
			}
			else{
				System.out.println("First name text box is not enabled");
			}
		}
		else{
			System.out.println("First name text box is not displayed on the page");
		}
	}
	
	@After
	public void quitBrowser(){
		//driver.quit();
	}
	
}






