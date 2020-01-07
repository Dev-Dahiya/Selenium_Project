package JavaScriptExecution;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollElement {
	WebDriver driver;
	JavascriptExecutor js;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
//		Thread.sleep(5000);
//		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		js.executeScript("window.location = 'https://letskodeit.teachable.com/pages/practice'; ");
		Thread.sleep(4000);
		
		js.executeScript("window.scrollBy(0, 1800)");
		Thread.sleep(4000);
		
		js.executeScript("window.scrollBy(0, -1800)");
		Thread.sleep(4000);
		
		WebElement mouseHover = driver.findElement(By.id("mousehover"));
		js.executeScript("arguments[0].scrollIntoView(true);", mouseHover);
		Thread.sleep(4000);
		
		js.executeScript("window.scrollBy(0, -190)");
//		
		
	}

}
