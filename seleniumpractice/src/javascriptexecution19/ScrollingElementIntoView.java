package javascriptexecution19;

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

public class ScrollingElementIntoView {
	WebDriver driver;
	String baseUrl;
	JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://learn.letskodeit.com/p/practice";
		js = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
//		js.executeScript("window.location = 'https://learn.letskodeit.com/p/practice';");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0, 1900);");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0, -1900);");
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.id("mousehover"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -200);");
		element.click();
	}

}
