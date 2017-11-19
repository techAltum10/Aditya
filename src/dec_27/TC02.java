package dec_27;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC02 extends LCB{

	@Parameters("browser")
	@Test
	public void atTestGmail(String browser) throws Exception{
		driver.get("http://www.gmail.com");
		
		String title = driver.getTitle();
		
		System.out.println("Page title is  : " + title);
		
		driver.findElement(By.id("abc")).click();
	}
}
