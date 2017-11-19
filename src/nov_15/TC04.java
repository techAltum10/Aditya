package nov_15;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TC04 {
	
	WebDriver driver;
	String url;
	
	@Before  //Before Act
	public void launchBrowser(){
		//Open Browser
		driver = new FirefoxDriver();
		
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		url = "http://www.google.com";
		
		driver.get(url);
		
	}
	
	@Test  //TC Logic
	public void atTest() throws Exception{
		//Type search string in text box
		driver.findElement(By.id("lst-ib")).sendKeys("Java");
		Thread.sleep(2000);
		
		
		String a = "//html/body/div[1]/div[3]/form/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div/ul/li[";
		int i = 1;
		String b = "]/div/div[2]";

		String xp = a + i + b;
		
		//for(int i = 0; i<10; i++)
		
		try{
			while(driver.findElement(By.xpath(xp)).isDisplayed()){
				xp = a + i + b;
				String txt = driver.findElement(By.xpath(xp)).getText();
				
				System.out.println(txt);
				
				if(txt.equalsIgnoreCase("javascript")){
					//Click on it
					driver.findElement(By.xpath(xp)).click();
					break;
					
				}
				
				i++;
				
			}
		}catch(Exception e){
			System.out.println("All element has been read.");
		}
		
	}
	
	@After
	public void quitBrowser(){
		//driver.quit();
	}

}
