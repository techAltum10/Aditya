package dec_27;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class LCB {

	WebDriver driver;
	
	//@Parameters("browser")
	@BeforeMethod
	//public void launchBrowser(String browser) throws Exception{
	public void launchBrowser() throws Exception{	
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.ANY);
		
		driver = new RemoteWebDriver(new URL("http://192.168.43.63:5555/wd/hub"), cap);
		
		/*if(browser.equalsIgnoreCase("firefox")){
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
		}*/
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void quitBrowser(ITestResult result) throws Exception{
		
		//TestNG Listners : Interface in Testng
		
		//Take screen only if test is PASS/FAIL
		
		if(!(result.isSuccess())){
			//Take Screenshot
			File srcScreen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			String loc = "D:\\";
			
			String fileName = result.getMethod().getMethodName() + new SimpleDateFormat("dd-MM-yyyy_hh-mm-ss").format(new GregorianCalendar().getTime()) + ".jpg";
			//method-dd-MM-yyyy_hh-mm-ss.jpg
			//atTestGmail27-12-2015_01-55-55.jpg
			String finalFile = loc + fileName;
			
			File destScreen = new File(finalFile);
			
			FileUtils.moveFile(srcScreen, destScreen);
		}
		
		
		
		driver.quit();
	}
}
