package testpackage;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchFrame {
	WebDriver driver;
	String baseURL;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		baseURL = "https://letskodeit.teachable.com/p/practice";

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(8000);
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		//driver.switchTo().frame("courses-iframe");
		//driver.switchTo().frame(0);
		driver.switchTo().frame("iframe-name");
		WebElement searchBox = driver.findElement(By.id("search-courses"));
		searchBox.sendKeys("python");
		Thread.sleep(4000);
		
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("Dev Kumar");
		
		
		
	}
	

}
