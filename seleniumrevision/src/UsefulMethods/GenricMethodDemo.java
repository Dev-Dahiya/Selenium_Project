package UsefulMethods;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import UsefulMethods.GenericMethod;

public class GenricMethodDemo {
	WebDriver driver;
	String baseURL;
	private GenericMethod gm;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		gm = new GenericMethod(driver);
		baseURL = "https://letskodeit.teachable.com/p/practice";
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		//driver.quit();
	}

	@Test
	public void test() {
		driver.get(baseURL);
		WebElement element = gm.getElement("name", "id");
		element.sendKeys("test");
		
		
	}

}
