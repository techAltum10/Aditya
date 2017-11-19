package dec_20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.junit.Test;

public class ReadDataFrmPropFile {

	@Test
	public void test01() throws Exception {

		String filePath = "D:\\Selenium_Projects\\ANT_JUnit\\data.properties";
		File file = new File(filePath);
		FileInputStream fIP = new FileInputStream(file);
		
		Properties prop = new Properties();
		prop.load(fIP);
		
		String a = prop.getProperty("name");
		
		System.out.println(a);
		
	}
}
