package switchto;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SwitchWindow {
	private WebDriver driver;
	private String baseURL;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		

		String parentHandle = driver.getWindowHandle();
		System.out.println("Parent handle is: " + parentHandle);
		
		WebElement windowButton = driver.findElement(By.id("openwindow"));
		windowButton.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		for (String handle : handles) {
			System.out.println(handle);	
			
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				Thread.sleep(3000);
				
				WebElement searchBox = driver.findElement(By.id("search-courses"));
				searchBox.sendKeys("python");
				Thread.sleep(2000);
				driver.close();
				break;
				
			}
		}
		
		driver.switchTo().window(parentHandle);
		driver.findElement(By.id("name")).sendKeys("Test Successful");
		
	}

}
