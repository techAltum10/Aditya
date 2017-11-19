package pack12;

import java.util.List;






import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC08 {
	
	WebDriver driver;
	String url;
	
	@BeforeMethod
	public void launchBrowser(){
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		url = "http://www.indianrail.gov.in/train_Schedule.html";
		
		//imp wait : applicable for all element
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Test
	public void atTest() throws Exception{
		
		driver.get(url);
		
		Thread.sleep(4000);
		
		//Exp wait : applicable one element
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("lccp_trnname")));
		
		driver.findElement(By.id("lccp_trnname")).sendKeys("10002");
		driver.findElement(By.name("getIt")).click();
		Thread.sleep(2000);
		
		WebElement table = driver.findElement(By.xpath("//html/body/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[6]/td/table"));
		List<WebElement> xRows = table.findElements(By.tagName("tr"));
		
		System.out.println("Total rows are : " + xRows.size());
		
		String a = "//html/body/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[6]/td/table/tbody/tr[";
		int t = 2;
		String b = "]/td[3]";
		String xpStation = a + t + b;
		
		for(t = 2; t<=xRows.size(); t++){
			xpStation = a + t + b;
			
			String stationName = driver.findElement(By.xpath(xpStation)).getText();
			System.out.println(stationName);
			
			if(stationName.equalsIgnoreCase("LAMTA")){
				System.out.println("Station Found");
				break;
			}
			
		}
		
	}
	
	
	@AfterMethod
	public void closeBrowser(){
		driver.quit();
	}
}
