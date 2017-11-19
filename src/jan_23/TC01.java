package jan_23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TC01 {
	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.naukri.com";
		
		driver.get(url);
	}
	
	@Ignore
	@Test
	public void atTest() throws Exception{
		Thread.sleep(2000);
		
		//Handle Multiple Browser Windows
		
		Set<String> mySet = driver.getWindowHandles();
		System.out.println("Total win are : " + mySet.size());
		System.out.println(mySet);
		
		Iterator<String> Itr = mySet.iterator();
		List<String> myL = new ArrayList<String>();
		
		for(int i = 0; i<mySet.size(); i++){
			
			myL.add(Itr.next());
		}
		
		driver.switchTo().window(myL.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(myL.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(myL.get(0));
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		//========================================================
		
		//Mouse Over More
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[text() = 'More']")));
		act.build().perform();
		Thread.sleep(1000);
		
		
		//Click on MCA
		driver.findElement(By.xpath("//a[text() = 'MCA']")).click();
		
		
		//Handle browser window
	Set<String> mySet1 = driver.getWindowHandles();
	System.out.println("Total win are 1 : " + mySet1.size());
	
	Iterator<String> Itr1 = mySet1.iterator();
	List<String> myL1 = new ArrayList<String>();
	
	for (int i=0; i<mySet1.size(); i++) {
		myL1.add(Itr1.next());
	}
		driver.switchTo().window(myL1.get(1));
		System.out.println(driver.getTitle());
	
	
		
	}
	
	@After
	public void quitBrowser(){
		
	}

}
