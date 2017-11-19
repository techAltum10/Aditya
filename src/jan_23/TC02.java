package jan_23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TC02 {
	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.indianrail.gov.in/train_Schedule.html";
		
		driver.get(url);
	}
	
	@Test
	public void atTest() throws Exception{
		Thread.sleep(2000);
		
		driver.findElement(By.name("lccp_trnname")).sendKeys("4682");
		driver.findElement(By.name("getIt")).click();
		Thread.sleep(2000);
		
		WebElement table = driver.findElement(By.xpath("//html/body/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[6]/td/table"));
		
		List<WebElement> myL = table.findElements(By.tagName("tr"));
		System.out.println("Total rows are : " + myL.size());
		
		String a = "//html/body/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[6]/td/table/tbody/tr[";
		int i = 2;
		String b = "]/td[3]";
		
		String xp = a + i + b;
		
		for(i = 2; i<=myL.size(); i++){
			xp = a + i + b;
			
			String text = driver.findElement(By.xpath(xp)).getText();
			System.out.println(text);
		}
	}
	
	@After
	public void quitBrowser(){
		
	}

}
