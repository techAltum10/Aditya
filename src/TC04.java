import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class TC04 {
	
	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		driver = new FirefoxDriver();
		
		/*System.setProperty("webdriver.ie.driver", "D:\\Selenium_Files\\IE_Driver_64_bit\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();*/
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Files\\Chrome Driver\\chromedriver.exe");
		
		//driver = new InternetExplorerDriver();
		
		//driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		url = "http://in.bookmyshow.com/national-capital-region-ncr";
		
		//driver.get(url);
		driver.navigate().to(url);
	}
	
	@Test
	public void atTest01() throws Exception{
		Thread.sleep(2000);
		
		driver.findElement(By.id("spnSelectedRegion")).click();
		Thread.sleep(2000);
		
		//Type some string in popup text box
		driver.findElement(By.id("inp_RegionSearch_top")).sendKeys("de");
		Thread.sleep(2000);
		
		String a = "//html/body/div[2]/header/nav/div[2]/div/ul[2]/li[7]/div/div[2]/span/div/div/div[";
		int i = 1;
		String b = "]";

		String xp = a + i + b;
		
		System.out.println("xp");
		System.out.println(xp);
		
		while(driver.findElement(By.xpath(xp)).isDisplayed()){
		
			String text = driver.findElement(By.xpath(xp)).getText();
			
			System.out.println(text);
			
			if(text.contains("National")){
				//Click on it
				driver.findElement(By.xpath(xp)).click();
				System.out.println("Found and clicked.");
				
				break;
			}
		}
		
	}
	
	@After
	public void quitBrowser(){
		//driver.quit();
	}
}
