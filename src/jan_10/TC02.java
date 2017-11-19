package jan_10;

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
		
		url = "https://selenium.googlecode.com/git/docs/api/java/index.html?org/openqa/selenium/interactions/Actions.html";
		
		driver.get(url);
	}
	
	@Test
	public void atTestGmail() throws Exception{
		
		/*
		 * Click on 'AddFindsByCss' in left pane OR get text from it
		 */
		
		//Switch on frame
		
		driver.switchTo().frame(driver.findElement(By.name("packageFrame")));
		
		
		/*String a = "//html/body/div[1]/ul/li[";
		int i = 5;
		String b = "]";
		
		String xp = a + i + b;
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(xp)).click();*/
		
		driver.findElement(By.xpath("//html/body/div[1]/ul/li[5]/a")).click();
	}

	@After
	public void quitBrowser(){
		
	}
}









