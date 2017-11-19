package may_23;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
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
		
		url = "http://www.google.com";
	}
	
	@Test
	public void testAjaxList() throws Exception{
		
		driver.get(url);
		
		String exp_Pagetitle = "Google";
		
		String act_PageTitle = driver.getTitle();
		
		if(exp_Pagetitle.equalsIgnoreCase(act_PageTitle)){
			System.out.println("We can go ahead");
		}
		else{
			throw new RuntimeException("Page is not displayed.");
		}
		
		driver.findElement(By.id("lst-ib1")).sendKeys("Java");
		Thread.sleep(1000);
		
		String a = "//html/body/div[1]/div[3]/form/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div/ul/li[";
		int i = 1;
		String b = "]/div/div[2]";

		String xp = a + i + b;
		
		//Loop : do While, while, for
		//for(int i = 0; i<10; i++)
		
		try{
			while(driver.findElement(By.xpath(xp)).isDisplayed()){
				xp = a + i + b;
				
				String s = driver.findElement(By.xpath(xp)).getText();
				System.out.println(s);
				
				if(s.equalsIgnoreCase("javatpoint")){
					driver.findElement(By.xpath(xp)).click();
					break;
				}
				
				i++;
			}
		}catch(Exception e){
			System.out.println("All lelement has been read.");
		}
	}
	
	@After
	public void closeBrowser(){
		
	}
	

}
