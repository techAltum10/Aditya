package jan_16;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TC02 {

	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		//Open Browser : FF
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.indianrail.gov.in/train_Schedule.html";
		
		driver.get(url);
	}
	
	@Test
	public void atTest() throws Exception{
		//TC Start
		Thread.sleep(2000);
		
		//CLick on 'Get Schedule'
		driver.findElement(By.xpath("//input[@name='getIt']")).click();
		Thread.sleep(2000);
		
		//Handle JS Alert
		Alert alrt = driver.switchTo().alert();
		
		 String text = alrt.getText();
		 System.out.println(text);
		 
		 alrt.accept();  //OK
		 
		 //alrt.dismiss();
		
	}

	@After
	public void quitBrowser(){
		
	}
}












