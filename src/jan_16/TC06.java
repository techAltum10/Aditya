package jan_16;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC06 {

	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		//Open Browser
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier";
		
		driver.get(url);
	}
	
	@Test
	public void atTest() throws Exception{
		
		//TC Logic
		driver.findElement(By.id("Email")).sendKeys("atyagi.mails");
		
		driver.findElement(By.name("signIn")).click();
		Thread.sleep(2000);
		
		if(driver.findElement(By.id("PersistentCookie")).isSelected()){
			System.out.println("Checkbox is already selected");
			
			//Uncheck
			driver.findElement(By.id("PersistentCookie")).click();
			System.out.println("Uncheck now");
		}
		else{
			System.out.println("Not Selected");
		}
		
		//driver.getwi
	}
	
	@After
	public void quitBrowser(){
		
	}
	
}
