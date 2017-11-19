package pack12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TC06 {
	
	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		url = "http://www.naukri.com";
	}
	
	@Test
	public void atTest() throws Exception{
		
		driver.get(url);
		
		Thread.sleep(4000);
		
		//Handling popups : Multople browser windows
		//driver.getw
		
		Set<String> mySet = driver.getWindowHandles();
		System.out.println("Size of windows are : " + mySet.size());
		
		Iterator<String> Itr = mySet.iterator();
		List<String> myL = new ArrayList<String>();
		
		for(int i=0; i<mySet.size(); i++){
			myL.add(Itr.next());
		}
		
		System.out.println(myL);
		
		Thread.sleep(2000);
		
		driver.switchTo().window(myL.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(myL.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(myL.get(0));
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
	}
	
	@After
	public void closeBrowser(){
		//driver.quit();
	}
	
	/*public static void main(String arg){
		
	}*/
	
	

}
