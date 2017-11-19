package jan_16;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.api.DesktopScreenRegion;
import org.sikuli.api.ImageTarget;
import org.sikuli.api.ScreenRegion;
import org.sikuli.api.Target;
import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.desktop.DesktopKeyboard;

public class TC07 {

	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		//Open Browser
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://convertonlinefree.com/PDFToWORDEN.aspx";
		
		driver.get(url);
	}
	
	@Test
	public void atTest() throws Exception{
		
		Thread.sleep(2000);
		driver.findElement(By.id("MainContent_fuDOCX")).click();
		Thread.sleep(2000);
		
		String filePath1 = "D:\\abc\\ImgPattern\\File_Adds.png";
		File file1 = new File(filePath1);
		
		//Sikuli
		Target t1 = new ImageTarget(file1);
		
		ScreenRegion sr1 = new DesktopScreenRegion();
		
		ScreenRegion sr2 = sr1.find(t1);
		
		Keyboard kb1 = new DesktopKeyboard();
		kb1.paste("D:\\abc\\Selenium_Content_WEB_APPS.pdf");
	}
	
	@After
	public void quitBrowser(){
		
	}
	
}
