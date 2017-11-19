package dec_20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LCB {

	public WebDriver driver;
	Properties prop = new Properties();
	@Before
	public void launchBrowser() throws Exception{
		
		//driver = new HtmlUnitDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Files\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String filePath = "D:\\Selenium_Projects\\ANT_JUnit\\data.properties";
		File file = new File(filePath);
		FileInputStream fIP = new FileInputStream(file);
		
		prop.load(fIP);
	}
	
	@After
	public void closeBrowser(){
		//driver.quit();
	}
}
