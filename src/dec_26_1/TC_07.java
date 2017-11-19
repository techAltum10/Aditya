package dec_26_1;

import java.io.File;

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
import org.sikuli.api.DesktopScreenRegion;
import org.sikuli.api.ImageTarget;
import org.sikuli.api.ScreenRegion;
import org.sikuli.api.Target;
import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.Mouse;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.api.robot.desktop.DesktopMouse;

public class TC_07 {
	
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
		
		/*//Call .exe
		Process proc = Runtime.getRuntime().exec("D:\\abc\\Upload.exe");
		Thread.sleep(1000);*/
		
		//Use Sikuli
		String imgPathFileAdds = "D:\\abc\\ImgPattern\\File_Adds.png";
		File fileAdds = new File(imgPathFileAdds);
		
		Target t1 = new ImageTarget(fileAdds);
		
		ScreenRegion sr1 = new DesktopScreenRegion();
		
		ScreenRegion sr2 = sr1.find(t1);
		
		System.out.println("Target t1 found");
		
		//Type File Address
		Keyboard kb = new DesktopKeyboard();
		kb.paste("D:\\abc\\Selenium_Content_WEB_APPS.pdf");
		
		//==========================================
		
		//Click on Open
		String fileOpenPath = "D:\\abc\\ImgPattern\\Open.png";
		File fileOpen = new File(fileOpenPath);
		
		Target t2 = new ImageTarget(fileOpen);
		
		ScreenRegion sr3 = new DesktopScreenRegion();
		ScreenRegion sr4 = sr3.find(t2);
		System.out.println("Target t2 found.");
		
		//Click on Open
		Mouse mouse = new DesktopMouse();
		mouse.click(sr4.getCenter());
		
		
		//Click on Convert
		//driver.findElement(By.id("MainContent_btnConvertDOCX")).click();
		
	}
	
	@After
	public void quitBrowser(){
		
	}

}
