package jan_16;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class TC05 {

	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		//Open Browser : FF
		driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.ie.driver", "D:\\Selenium_Files\\IE_Driver_64_bit\\IEDriverServer.exe");
		//driver = new InternetExplorerDriver();
		
		/*System.setProperty("webdriver.chrome.driver", "D:/Selenium_Files/Chrome Driver/chromedriver.exe");
		driver = new ChromeDriver();*/
		driver.manage().window().maximize();
		
		url = "http://www.flipkart.com";
		
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void atTest() throws Exception{
		//TC Start
		Thread.sleep(5000);
		
		driver.findElement(By.id("fk-top-search-box")).sendKeys("mobile");
		Thread.sleep(5000);
		
		String a = "//html/body/div[2]/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div/div[1]/div/div[2]/table/tbody/tr/td/ul/li[";
		int i = 1;
		String b = "]";
		
		String xp  = a+ i + b;
		
		while(driver.findElement(By.xpath(xp)).isDisplayed()){
			xp  = a+ i + b;
			String text = driver.findElement(By.xpath(xp)).getText();
			System.out.println(text);
			i++;
		}
		
		
	}

	@After
	public void quitBrowser(){
		
	}
}












