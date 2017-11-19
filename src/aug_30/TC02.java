package aug_30;

import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class TC02 {
WebDriver driver;

	@Test
	public void atTest01() throws Exception{

		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.ANY);
		
		driver = new RemoteWebDriver(new URL("http://192.168.43.131:5555/wd/hub"), cap);
		
		
		driver.get("http://www.google.com");
	}
}
