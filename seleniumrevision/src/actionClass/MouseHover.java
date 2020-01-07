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

public class MouseHover {
	WebDriver driver;
	String baseURL;
	JavascriptExecutor js;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		js = (JavascriptExecutor) driver;
		baseURL = "https://letskodeit.teachable.com/p/practice";
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		js.executeScript("window.scrollBy(0, 600)");
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.id("mousehover"));
		
		Actions action = new Actions(driver); 
		action.moveToElement(element).perform();
		Thread.sleep(3000);
		
		WebElement subElement = driver.findElement(By.xpath("//div[@class='mouse-hover-content']//a[text()='Top']"));
		//subElement.click();
		action.moveToElement(subElement).click().perform();
		//subElement.click();
		
		
	}

}
