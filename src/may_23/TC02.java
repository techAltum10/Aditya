package may_23;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC02 {
	
	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.guru99.com/java-tutorial.html";
	}
		
	@Test
	public void testAjaxList() throws Exception
	{
	driver.get(url);
	Thread.sleep(2000);
	
	driver.switchTo().frame(driver.findElement(By.id("af-iframe-894610241")));
	
	driver.findElement(By.id("awf_field-70046960")).sendKeys("Java");
	//driver.findElement(By.id("awf_field-70046961")).sendKeys("abc@gmail.com");
	
	//Mouse mouse = new DesktopMouse();
	
	//Keyboard keybrd = new DesktopKeyboard();
	
	}
	
	@After
	public void closeBrowser(){
		
	}
}
