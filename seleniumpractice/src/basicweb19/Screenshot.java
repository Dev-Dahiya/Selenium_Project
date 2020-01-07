package basicweb19;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import basicweb19.GenericMethods;

public class Screenshot {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
//		baseUrl = "https://www.google.com/";
		baseUrl = "https://www.expedia.com/";
		driver.manage().window().maximize();
	}

	@Test
	public void elementList() throws InterruptedException {
		driver.get(baseUrl);
	}
	
	public static String getRandomString(int length){
		StringBuffer sb = new StringBuffer();
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		int range = characters.length();
		for(int i=0; i<length; i++){
			int index = (int)(Math.random()*range);
			sb.append(characters.charAt(index));
		}
		return sb.toString();
	}
	
	public static String getRandomString(){
		Date date = new Date();
		String randomString = date.toString().replaceAll(" ", "");
		return randomString;
	}
	
	@After
	public void tearDown() throws Exception {
		String fileName = getRandomString(5) + ".png";
		String directory = "//Users//devkumar//Desktop//";
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File(directory + fileName);
		FileUtils.copyFile(sourceFile, destFile);
		driver.quit();
	}

}
