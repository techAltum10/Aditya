package dec_20;

import org.junit.Test;
import org.openqa.selenium.By;


public class TC02 extends LCB{

	//@Ignore
	@Test
	public void atTest01() throws Exception{
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
		
		//Read Data from XL file
		String[][] data = ReadDataFrmXL.atTest();
		
		String userName = data[2][0];
		System.out.println(userName);
		
		//Enter UserID
		driver.findElement(By.id("Email")).sendKeys(userName);
	}
	
}
