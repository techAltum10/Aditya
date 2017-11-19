package ddf_PropFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.junit.Test;

public class ReadFrmPropFile {

	@Test
	public void atTest() throws Exception{
		
		String filePath = "D:\\Selenium_Projects\\ANT_JUnit\\data.properties";
		File file = new File(filePath);
		FileInputStream fIP = new FileInputStream(file);
		
		Properties prop = new Properties();
		prop.load(fIP);
		
		String s = prop.getProperty("name");
		System.out.println(s);
		
		String s1 = prop.getProperty("adds");
		System.out.println(s1);
		
	}
}
