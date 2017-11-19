package dec_26_1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LCB {

	WebDriver driver;
	
	@Parameters("browser")
	//@BeforeMethod
	@BeforeClass
	public void launchBrowser(String browser){
		
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
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	//@AfterMethod
	@AfterClass
	public void closeBrowser(ITestResult result) throws Exception{    //Take screenshot only if TC fail
		
		//TestNG Listners
		
		if(!(result.isSuccess())){
			//Take ScreenShot
			//System.out.println("Fail");
			//Take ScreenShot
			File srcScreen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			String loc = "D:\\";
			
			//methodName-dd-MM-yyyy_hh-mm-ss.jpg
			//String fileName = test.getMethod().getMethodName() + new SimpleDateFormat("dd-MM-yyyy_hh-mm-ss").format(new GregorianCalendar().getTime()) + ".jpg";
			
			String fileName = result.getMethod().getMethodName() + new SimpleDateFormat("dd-MM-yyyy_hh-mm-ss").format(new GregorianCalendar().getTime()) + ".jpg";
			
			System.out.println(fileName);
			
			String finalFile = loc + fileName;
			
			File destScreen = new File(finalFile);
			
			//FileUtils.moveFile(srcScreen, destScreen);
			FileUtils.copyFile(srcScreen, destScreen);
		}
		
		driver.quit();
	}
}
