package ddf_PropFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC01 extends LCB{
	
	@Test
	public void atTest() throws Exception{
		//Read url from prop file

	  /*String filePath = "D:\\Selenium_Projects\\ANT_JUnit\\data.properties";
		File file = new File(filePath);
		FileInputStream fIP = new FileInputStream(file);
		
		Properties prop = new Properties();
		prop.load(fIP);*/
		
		//Enter url
		//String vUrl = prop.getProperty("url");
		driver.get(getValueFromPropFile("url"));
		
		//Click on Login 
		//String locLogin = prop.getProperty("xpLoginButton");
		driver.findElement(By.xpath(getValueFromPropFile("xpLoginButton"))).click();
		Thread.sleep(1000);
		
		//Enter user name
		driver.findElement(By.xpath(getValueFromPropFile("xpUserName"))).sendKeys(getValueFromPropFile("dataUserName"));
		
		//Enter Passwd
		driver.findElement(By.xpath(getValueFromPropFile("xpPasswd"))).sendKeys(getValueFromPropFile("dataPasswd"));
		
		//Click on Login
		driver.findElement(By.xpath(getValueFromPropFile("xpLogin"))).click();
		Thread.sleep(2000);
		
		if(driver.findElement(By.xpath(getValueFromPropFile("xpLogin"))).isDisplayed()){
			System.out.println("Login button is still on page.");
			
			throw new RuntimeException("Login failed.");
		}else{
			System.out.println("Login is passed.");
		}
	}
}
