package dec_26_1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.lift.find.InputFinder;
import org.openqa.selenium.support.ui.Select;

public class TC_06 {
	
	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
	
		//driver = new FirefoxDriver();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.get("http://convertonlinefree.com/PDFToWORDEN.aspx");
	   
	}
	
	@Test
	public void atTest() throws Exception{
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("MainContent_fuDOCX")).click();
		Thread.sleep(1000);
		
		//Call .exe
		Process proc = Runtime.getRuntime().exec("D:\\abc\\Upload.exe");
		Thread.sleep(1000);
		
		//Click on Convert
		driver.findElement(By.id("MainContent_btnConvertDOCX")).click();
		
	}
	
	@After
	public void quitBrowser(){
		
	}

}
