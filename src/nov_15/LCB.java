package nov_15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LCB {

	WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void launchBrowser(String br){
		
		if(br.equalsIgnoreCase("firefox")){
			//Open FF
			driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("chrome")){
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
	}
	
	@AfterMethod
	public void quitBrowser(){
		driver.quit();
	}
}
