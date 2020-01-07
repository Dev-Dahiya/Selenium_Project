package testpackage;

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
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.WaitTypes;

public class Screenshot {
	WebDriver driver;
	String baseURL;
	static WaitTypes wt;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		baseURL = "https://letskodeit.teachable.com/";
		driver.get(baseURL);
	}

	@After
	public void tearDown() throws Exception {
		String fileName = getRandomString(4) + ".png";
		String directory = "//Users//devkumar//Desktop//";
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory + fileName));
	}

	@Test
	public void test() {
		driver.findElement(By.xpath("//div[@id='navbar']//div/ul/li[2]/a")).click();
		wt = new WaitTypes(driver);
		WebElement emailField = wt.waitForElement(By.id("user_email"), 5);
		emailField.sendKeys("test");
		driver.findElement(By.id("new_user")).click();
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
