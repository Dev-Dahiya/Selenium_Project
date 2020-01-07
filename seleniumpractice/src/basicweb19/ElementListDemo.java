package basicweb19;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import basicweb19.GenericMethods;

public class ElementListDemo {
	WebDriver driver;
	String baseUrl;
	GenericMethods gm;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://learn.letskodeit.com/p/practice";
		gm = new GenericMethods(driver);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void test() {
		List<WebElement> elements = gm.getElementList("classname", "btn-style");
		System.out.println(elements.size());
		for(WebElement e : elements){
			System.out.println(e.getAttribute("value"));
		}
	}

}
