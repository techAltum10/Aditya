package common.utilities;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchCloseBrowser {
	public WebDriver driver;
	
	@Before
	public void launchBrowser() throws Exception{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	@After
	public void closeBrowser() throws Exception{
		//driver.quit();
	}

}
