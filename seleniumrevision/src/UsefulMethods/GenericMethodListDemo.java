package UsefulMethods;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import UsefulMethods.GenericMethod;

public class GenericMethodListDemo {
	WebDriver driver;
	String baseURL;
	GenericMethod gm;

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
		driver.quit();
	}

	@Test
	public void test() {
		driver.get(baseURL);
		List <WebElement> elementList = gm.getElementList("//input[@type='text']", "xpath");
		int size = elementList.size();
		System.out.println("Size of the list is: " +size );
		

	}

}
