package ddf_PropFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LCB {

	WebDriver driver;
	static Properties prop = new Properties();
	
	@Parameters("browser")
	@BeforeMethod
	public void launchBrowser(String browser) throws Exception{
		
		if(browser.equalsIgnoreCase("firefox")){
			//Open FF
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")){
			//Open Chrome
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Files\\Chrome Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else{
			//Open IE
			System.setProperty("webdriver.ie.driver", "D:\\Selenium_Files\\IE_Driver_64_bit\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		String filePath = "D:\\Selenium_Projects\\ANT_JUnit\\data.properties";
		File file = new File(filePath);
		FileInputStream fIP = new FileInputStream(file);
		
		prop.load(fIP);
	}
	
	@AfterMethod
	public void closeBrowser(ITestResult test){
	
		if(!test.isSuccess()){
			//Take screenshot
		}
		driver.quit();
	}
	
	public static String getValueFromPropFile(String key){
		return prop.getProperty(key);
	}
	
}
