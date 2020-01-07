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

public class CalSelection {
	WebDriver driver;
	String baseURL;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "https://www.expedia.co.in/";
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	/*@Test
	public void test() {
		driver.get(baseURL);
		driver.findElement(By.id("tab-flight-tab")).click();
		driver.findElement(By.id("flight-departing")).click();
		driver.findElement(By.xpath("//div[@id='flight-departing-wrapper']//div[2]//button[text()='18']")).click();
	}*/

	@Test
	public void test2() {
		driver.get(baseURL);
		driver.findElement(By.id("tab-flight-tab")).click();
		driver.findElement(By.id("flight-departing")).click();
		WebElement calMonth = driver.findElement(By.xpath("//div[@id='flight-departing-wrapper']//div[2]"));
		List<WebElement> validDates = calMonth.findElements(By.className("datepicker-cal-date"));
		for(WebElement date : validDates) {
			if(date.getText().equals("30")) {
				date.click();
				break;
			}
		}
	}

}
