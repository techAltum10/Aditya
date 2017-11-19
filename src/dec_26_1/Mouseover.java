package dec_26_1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {
WebDriver driver;
String url;


@Before
public void launchbrowser()

{  
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.naukri.com");
	
}

@Test
public void atTest() throws InterruptedException

{ // Mouse over jobs
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//div[text() = 'Jobs']")));
	act.build().perform();
	
	//click on jobs by skills
	driver.findElement(By.xpath("//a[text() = 'Jobs by Skill']")).click();
	Thread.sleep(20000);
	
	//click on software testing jobs
	driver.findElement(By.xpath("//a[text() = 'Software Testing Jobs']")).click();
	
	//select check box for location as delhi NCR
	
	}

//@After


}
