package testpackage1;

import static org.junit.Assert.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakingScreenshots {
	private WebDriver driver;
	private String baseURL;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "http://www.expedia.com";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
	}

	@After
	public void tearDown() throws Exception {
		String fileName = getRandomString(7) + ".png";
		String directory = "//Users//devkumar//Desktop//";
		
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory + fileName));
	}

	@Test
	public void test() {
		driver.get(baseURL);
		driver.findElement(By.id("tab-flight-tab")).click();
		WebElement flight_origin = driver.findElement(By.id("flight-origin"));
		WebElement flight_destination = driver.findElement(By.id("flight-destination"));
		WebElement departing_date = driver.findElement(By.id("flight-departing"));
		WebElement return_date = driver.findElement(By.id("flight-returning"));
		WebElement search_button = driver.findElement(By.id("search-button"));
		
		flight_origin.sendKeys("New York");
		flight_destination.sendKeys("New York");
		departing_date.sendKeys("29/04/2017");
		return_date.sendKeys("30/04/2017");
		search_button.click();
	}
	public static String getRandomString(int length) {
		StringBuilder sb = new StringBuilder();
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		for (int i = 0; i < length; i++) {
			int index = (int) (Math.random() * characters.length());
			sb.append(characters.charAt(index));
		}
		
		return sb.toString();
}
}
