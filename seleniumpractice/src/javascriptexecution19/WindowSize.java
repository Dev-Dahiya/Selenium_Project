package javascriptexecution19;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowSize {
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
	public void test() {
		driver.get(baseUrl);
		long innerHeight = (Long)js.executeScript("return window.innerHeight;");
		long innerWidth = (Long)js.executeScript("return window.innerWidth;");
		
		long outerHeight = (Long)js.executeScript("return window.outerHeight;");
		long outerWidth = (Long)js.executeScript("return window.outerWidth;");
		
		System.out.println("Inner Height: " + innerHeight);
		System.out.println("Inner Width: " + innerWidth);
		System.out.println("Outer Height: " + outerHeight);
		System.out.println("Outer Width: " + outerWidth);
		
	}

}
