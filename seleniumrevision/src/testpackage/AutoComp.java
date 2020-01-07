package testpackage;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoComp {
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "https://www.southwest.com/";
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
		driver.get(baseURL);
		driver.findElement(By.id("air-city-departure")).sendKeys("New York");
		
		WebElement element = driver.findElement(By.xpath("//div//div[contains(@class, 'js-overlay-container')]"));
		List<WebElement> results = element.findElements(By.tagName("li"));
		Thread.sleep(3000);
		for(WebElement result : results) {
			if(result.getText().equals("Long Island/Islip, NY - ISP")) {
				result.click();
			}
		}
	}

}
