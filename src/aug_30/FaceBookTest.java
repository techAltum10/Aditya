package aug_30;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookTest {

	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "https://www.facebook.com/";
	}
	@Test
	public void atTest(){
		driver.get(url);
		
		//Female radio
		if(driver.findElement(By.id("u_0_d")).isSelected()){
			System.out.println("Female Radio button is selected");
		}else{
			System.out.println("Not selected");
		}
		
		//Select Value from drop down
		new Select(driver.findElement(By.id("day"))).selectByIndex(4);  //Select 4
		
		new Select(driver.findElement(By.id("month"))).selectByValue("5");  //May
		
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("1960");
		
	}
	@After
	public void closeBrowser(){
		
	}
	
}
