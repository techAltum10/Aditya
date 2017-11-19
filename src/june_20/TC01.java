package june_20;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC01 {

	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		driver = new FirefoxDriver();
		//driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		
		url = "http://www.indianrail.gov.in/train_Schedule.html";
		
		//driver.manage().timeouts().setScriptTimeout(80, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
		//imp wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void atTest() throws Exception{
		driver.get(url);
		
		//Exp wait
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("getIt")));
		
		//driver.findElement(By.name("getIt")).click();
		Thread.sleep(1000);
		
		//js alrt
		Alert alrt = driver.switchTo().alert();
		System.out.println(alrt.getText());
		
		alrt.accept();
		
		//alrt.dismiss();
		
	}
	
	@After
	public void closeBrowser(){
		
	}
}
