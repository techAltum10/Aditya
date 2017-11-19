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

public class TC04 {

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
		
		url = "http://www.jabong.com/online-sale/";
		
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void atTest() throws Exception{
		//TC Start
		Thread.sleep(5000);
		
		/*
		 * Ajax : is combination of JavaScript + XML : it makes async. request to the sertver
		 * and get/display data on page without refreshing it. 
		 */
		
		//Type som string to search
		driver.findElement(By.id("search")).sendKeys("Shirt");
		Thread.sleep(8000);
		
		//Handle Ajax List : Abs xpath
		
		/*String a = "//html/body/div[2]/div[3]/header/div/div[2]/div[2]/div/div[2]/div[4]/ul/li[";
		int i = 1;
		String b = "]/a";

		String xp = a + i + b;
		System.out.println(xp);
		//for(int i = 1; i<10; i++)
		while(driver.findElement(By.xpath(xp)).isDisplayed()){
			 xp = a + i + b;
			
			 String text = driver.findElement(By.xpath(xp)).getText();
			 System.out.println(text);
			 
			 i++;
			
		}*/
		
		WebElement we  = driver.findElement(By.id("ul-pdp-search-res"));
		
		List<WebElement> myL = we.findElements(By.tagName("li"));
		System.out.println(myL.size());
		
		for(int i = 0; i<myL.size(); i++){
			String s = myL.get(i).getText();
			System.out.println(s);
		}
		
	}

	@After
	public void quitBrowser(){
		
	}
}












