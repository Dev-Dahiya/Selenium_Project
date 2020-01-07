package basicweb19;

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

public class StaleElementExceptionDemo2 {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://www.southwest.com/";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testAutocomplete() throws Exception {
		driver.get(baseUrl);
		String searchingText = "New York/Newark, NJ - EWR";
		String partialText = "New York";
		String id = "LandingAirBookingSearchForm_originationAirportCode--item-2";

		WebElement text = driver.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode"));
		text.sendKeys(partialText);
//		Thread.sleep(3000);

		List<WebElement> results = driver.findElements(By.xpath("//div[@id='FlyoutTrigger_250']//li"));
		int size = results.size();

		System.out.println("The size of the list is: " + size);

		for (int i = 0; i < size; i++) {
			System.out.println(results.get(i).getAttribute("id"));
		}

		Thread.sleep(3000);
		for (WebElement result : results) {
			if (result.getAttribute("id").equals(id)) {
				System.out.println("Selected: " + result.getText());
				result.click();
//				break;
			}
		}
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}


}
