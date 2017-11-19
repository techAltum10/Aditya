package dec_26_1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC02 extends LCB{

	@Test
	public void atTestGmail() throws Exception{
		driver.get("http://www.gmail.com");
		
		String title = driver.getTitle();
		
		System.out.println("Page title is  : " + title);
		
		driver.findElement(By.id("abc")).click();
	}
}
