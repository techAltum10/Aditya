import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TC01 {
	
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
	public void atTest01() throws Exception{
		driver.findElement(By.name("getIt")).click();
		Thread.sleep(1000);
		
		//Handle JS Alert
		Alert alrt = driver.switchTo().alert();
		
		String text = alrt.getText();
		System.out.println(text);
		
		//OK
		alrt.accept();
		
		//alrt.dismiss();
		
	}
	
	@After
	public void quitBrowser(){
		driver.quit();
	}
}
