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
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchWindow {
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
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		String parentHandle = driver.getWindowHandle();
		System.out.println("Value of parent handle is: " + parentHandle);
		
		driver.findElement(By.id("openwindow")).click();
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			System.out.println("Value of all handles is: " +handle);
			if(!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				Thread.sleep(2000);
				
				driver.findElement(By.id("search-courses")).sendKeys("python");
				Thread.sleep(2000);
				driver.close();
				break;
			}
		}
		driver.switchTo().window(parentHandle);
		driver.findElement(By.id("name")).sendKeys("Test Succesful");
	}

}
