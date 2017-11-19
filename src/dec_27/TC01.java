package dec_27;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC01 extends LCB{

	@Parameters("browser")
	@Test
	public void atTestGoogle(String browser) throws Exception{
		driver.get("http://www.google.com");
		
		String title = driver.getTitle();
		
		System.out.println("Page title is  : " + title);
		
		driver.findElement(By.id("abc")).click();
		
	}
}
