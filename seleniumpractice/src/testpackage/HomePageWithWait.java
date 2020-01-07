package testpackage;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageWithWait {
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("/Applications/Firefox.app/Contents/MacOS/firefox-bin");
		FirefoxDriver driver = new FirefoxDriver(options);
		
		baseURL = "https://letskodeit.teachable.com/p/practice";
		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get(baseURL);
	}

	@Test
	public void test() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement alert = wait.until(ExpectedConditions.elementToBeClickable(By.id("name")));
		alert.sendKeys("test");
	}

}
