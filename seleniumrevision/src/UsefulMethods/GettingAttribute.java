package UsefulMethods;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GettingAttribute {
	WebDriver driver;
	String baseURL;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice";
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		driver.get(baseURL);
		WebElement element = driver.findElement(By.id("name"));
		String attributeValue = element.getAttribute("placeholder");
		System.out.println("value of attribute is: " + attributeValue);
	}

}
