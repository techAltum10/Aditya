package dec_27;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC03 extends LCB{

	//@Parameters("browser")
	@Test
	//public void atTestFlipKart(String browser) throws Exception{
	public void atTestFlipKart() throws Exception{
		driver.get("http://www.flipkart.com");
		
		String title = driver.getTitle();
		
		System.out.println("Page title is  : " + title);
		
		/*//Take Screenshot
		File srcScreen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destScreen = new File("D:\\abc123456789.jpg");
		
		FileUtils.moveFile(srcScreen, destScreen);*/
	}
}
