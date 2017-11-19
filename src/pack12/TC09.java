package pack12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;






import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC09 {
	
	WebDriver driver;
	String url;
	
	@BeforeMethod
	public void launchBrowser(){
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		url = "http://www.naukri.com";
		
		//imp wait : applicable for all element
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Test
	public void atTest() throws Exception{
		
		driver.get(url);
		
		Thread.sleep(4000);
		
		//Mouse over More
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[text() = 'More']")));
		act.build().perform();
		Thread.sleep(1000);
		
		//Click on MCA
		driver.findElement(By.xpath("//a[text() = 'MCA']")).click();
		Thread.sleep(1000);
		
		//Handle new window
		Set<String> mySet = driver.getWindowHandles();
		System.out.println("Total wins are : " + mySet.size());
		
		Iterator<String> Itr = mySet.iterator();
		List<String> myL = new ArrayList<String>();
		
		for(int i = 0; i<mySet.size(); i++){
			myL.add(Itr.next());
		}
		
		driver.switchTo().window(myL.get(2));
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("metroCitySearchBox")).click();
		driver.findElement(By.id("metroCitySearchBox")).sendKeys("Delhi");
		
	}
	
	
	@AfterMethod
	public void closeBrowser(){
		driver.quit();
	}
}
