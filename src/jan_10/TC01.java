package jan_10;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC01 {

	//Dec WebDriver
	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		//Open Browser
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.google.com";
		
		driver.get(url);
	}
	
	@Test
	public void atTestGmail() throws Exception{
		//Ajax : XML and JavaScript : It makes async. request to the server and get/display data on page without refreshing it.
		driver.findElement(By.id("lst-ib")).sendKeys("Java");
		Thread.sleep(1000);
		
		String a = "//html/body/div[1]/div[3]/form/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div/ul/li[";
		int i = 1;
		String b = "]/div/div[2]";

		String xp = a + i + b;
		
		//for(i = 1; i<10; i++)
		
		//do() while(i<10)
		
		try{
			while(driver.findElement(By.xpath(xp)).isDisplayed()){
				
				xp = a + i + b;
				
				String text = driver.findElement(By.xpath(xp)).getText();
				System.out.println(text);
				
				if(text.equalsIgnoreCase("javatpoinT")){
					driver.findElement(By.xpath(xp)).click();
					System.out.println("Found and clicked.");
					
					break;
				}
				
				i++;
			}
		}
		catch(Exception e){
			System.out.println("All element has been read.");
		}
	}
	
	@After
	public void quitBrowser(){
		
	}
}









