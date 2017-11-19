package dec_20;

import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;

public class TC01 extends LCB{

	//@Ignore
	@Test
	public void atTest01() throws Exception{
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
		
		//Read Data from property file
		String vIdUserName = prop.getProperty("idUserName");
		String vDataUserName = prop.getProperty("dUserName");
		
		//Enter UserID
		driver.findElement(By.id(vIdUserName)).sendKeys(vDataUserName);
	}
	
}
