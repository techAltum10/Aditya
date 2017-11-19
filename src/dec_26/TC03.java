package dec_26;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC03 {

	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		//Open browser
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier";
		
		driver.get(url);
		
	}
	
	@Test
	public void atTest() throws Exception{

		//Enter User name
		driver.findElement(By.id("Email")).sendKeys("ankita.makkar1989@gmail.com");
		
		//Click on Next
		driver.findElement(By.id("next")).click();
		Thread.sleep(2000);
				
		
		//On Next Page : Verify that 'Stay signed in' is checked or not
		
		if(driver.findElement(By.id("PersistentCookie")).isSelected()){
			
			System.out.println("Check Box is selected");
			
			//And if it is checked then uncheck it before login
			
			driver.findElement(By.id("PersistentCookie")).click();
			System.out.println("Check box is unchecked now");
		}
		
		else{
			System.out.println("Check Box is not selected");
			
		}
		
		/*if (driver.findElement(By.id("PersistentCookie"))).isSelected(){
		
		System.out.println("Check box not selected");
			
		}*/
		
		
	}
	
	@After
	public void quitBrowser(){
		//driver.quit();
	}
	
}






