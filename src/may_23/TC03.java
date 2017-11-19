package may_23;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC03 {
	
	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "https://accounts.google.com/ServiceLogin?service=oz&passive=1209600&continue=https://plus.google.com/photos?gpsrc%3Dgplp0#identifier";
	}
		
	@Test
	public void testAjaxList() throws Exception
	{
		driver.get(url);
		driver.findElement(By.id("Email")).sendKeys("testng12");
		driver.findElement(By.id("next")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Passwd")).sendKeys("pass$123");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Add your photo']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Select a photo from your computer']")).click();
		Thread.sleep(2000);
		//Call .exe
		
		Process proc = Runtime.getRuntime().exec("D:\\ANDROID\\UploadFile.exe");
		Thread.sleep(10000);
		
		//Exp Wait : Fluent wait
		
		driver.findElement(By.xpath("//div[text() = 'Set as profile photo']")).click();
		
		((JavascriptExecutor)driver).executeScript("scroll(0, 400);");
		
		//Take screenshot
		
		//Scroll
		
		//Take screenshot
	}
	
	@After
	public void closeBrowser(){
		
	}
}
