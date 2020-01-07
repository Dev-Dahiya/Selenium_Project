package switchto19;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchFrame {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://learn.letskodeit.com/p/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.switchTo().frame("courses-iframe");
//		driver.switchTo().frame("iframe-name");
//		driver.switchTo().frame(0);		
		
		WebElement searchBoxFrame = driver.findElement(By.id("search-courses"));
		searchBoxFrame.sendKeys("Python");
		Thread.sleep(4000);
		
		driver.switchTo().defaultContent();
		
		WebElement searchBoxMain = driver.findElement(By.id("name"));
		searchBoxMain.sendKeys("Dev Kumar");
	}
}