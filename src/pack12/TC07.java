package pack12;

import java.util.List;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC07 {
	
	WebDriver driver;
	String url;
	
	@BeforeMethod
	public void launchBrowser(){
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		url = "http://www.indianrail.gov.in/train_Schedule.html";
	}
	
	@Test(dataProvider = "testData")
	public void atTest(String textBoxId, String trainNum) throws Exception{
		
		driver.get(url);
		
		Thread.sleep(4000);
		
		driver.findElement(By.name(textBoxId)).sendKeys(trainNum);
		
		driver.findElement(By.name("getIt")).click();
		Thread.sleep(2000);
		
		String tableOneText = driver.findElement(By.xpath("//html/body/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[4]/td/table")).getText();
		
		if(tableOneText.contains("SAT")){
			System.out.println("SAT");
		}else{
			System.out.println("No Way");
		}
		
		System.out.println("********************************");
		
		WebElement tableTwo = driver.findElement(By.xpath("//html/body/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[6]/td/table"));

		List<WebElement> myL = tableTwo.findElements(By.tagName("tr"));
		System.out.println("Total rows are : " + myL.size());
		
		String a = "//html/body/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[6]/td/table/tbody/tr[";
		int i = 2;
		String b = "]/td[3]";

		String xp = a + i + b;
		
		for(i = 2; i<=myL.size(); i++){
			xp = a + i + b;
			
			String stationName = driver.findElement(By.xpath(xp)).getText();
			
			System.out.println(stationName);
			
			if(stationName.equalsIgnoreCase("DEOBAND")){
				System.out.println("Station Found");
				break;
			}
		}
	}
		@DataProvider(name = "testData")
		public Object[][] testDataProvider() throws Exception{
			
			 Object [][]xData = new Object[1][2];
			 
			 xData[0][0] = "lccp_trnname";
			
			 xData[0][1] = "4682";
			
			
			return xData;
			
		}
	
	
	@AfterMethod
	public void closeBrowser(){
		//driver.quit();
	}
	
	/*public static void main(String arg){
		
	}*/
	
	

}
