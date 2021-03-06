package actionClass;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderAction {
	WebDriver driver;
	String baseURL;
	
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		
		baseURL = "http://jqueryui.com/slider/";
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		driver.switchTo().frame(0);
		
		WebElement element = driver.findElement(By.xpath("//div[@id='slider']/span"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(element, 150, 0).perform();
		
		
		
	}

}
