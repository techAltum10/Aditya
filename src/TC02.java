import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class TC02 {
	
	//https://selenium.googlecode.com/git/docs/api/java/index.html?org/openqa/selenium/interactions/Actions.html
	
	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		//driver = new FirefoxDriver();
		
		System.setProperty("webdriver.ie.driver", "D:\\Selenium_Files\\IE_Driver_64_bit\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		
		//driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		url = "http://www.flipkart.com/";
		
		//driver.get(url);
		driver.navigate().to(url);
	}
	
	@Test
	public void atTest01() throws Exception{
		Thread.sleep(2000);
		
		//Delete Page cookiess
		driver.manage().deleteAllCookies();
		
		//Refresh
		
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		
		if(driver.findElement(By.xpath("//span[@class = 'close-icon close']")).isDisplayed()){
		
			driver.findElement(By.xpath("//span[@class = 'close-icon close']")).click();
			System.out.println("Popup is closed");
		}
		else{
			//Click on Login
		}
	}
	
	@After
	public void quitBrowser(){
		driver.quit();
	}
}
