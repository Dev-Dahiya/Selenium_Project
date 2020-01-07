package JavaScriptExecution;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WindowSizeDemo {
	private WebDriver driver;
	private JavascriptExecutor js;
	
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		js = (JavascriptExecutor) driver;
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	public void test() {
		js.executeScript("window.location = 'https://letskodeit.teachable.com/pages/practice'");
		
		long height =  (long) js.executeScript("return window.innerHeight;");
		long width = (long) js.executeScript("return window.innerWidth;");
		
		System.out.println("Height is: " + height);
		System.out.println("Width is: :" + width);
	}

}
