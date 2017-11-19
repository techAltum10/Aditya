package dec_26_1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class TC03 extends LCB{

	@Test
	public void atTestFlipKart() throws Exception{
		driver.get("http://www.flipkart.com");
		
		String title = driver.getTitle();
		
		System.out.println("Page title is  : " + title);
		
		/*//Take ScreenShot
		File srcScreen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destScreen = new File("D:\\abc32145.jpg");
		
		//FileUtils.moveFile(srcScreen, destScreen);
		FileUtils.copyFile(srcScreen, destScreen);*/
	}
}
