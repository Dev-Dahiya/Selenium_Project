package basicweb19;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetElementTextAndAttribute {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://learn.letskodeit.com/p/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void test() {
		WebElement e1 = driver.findElement(By.xpath("//legend[contains(text(),'Radio')]//parent::fieldset/label[3]"));
		System.out.println(e1.getText());
		WebElement e2 = driver.findElement(By.id("opentab"));
		System.out.println(e2.getAttribute("class"));
		System.out.println(e2.getAttribute("innerText"));
		System.out.println(e2.getAttribute("textContent"));
		System.out.println(e2.getAttribute("innerHTML"));
		System.out.println(driver.findElement(By.id("bmwradio")).getAttribute("value"));
		String attribute = "class";
		String attributeValue = e2.getAttribute(attribute);
		System.out.println("value of " + attribute + " attribute is: " + attributeValue);

	}

}
