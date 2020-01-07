package testpackage1;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarSelectionDemo {
private WebDriver driver;
private String baseURL;


	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "http://www.expedia.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		driver.findElement(By.id("tab-flight-tab")).click();
		//WebElement departingField = driver.findElement(By.id("flight-departing"));
		//departingField.click();
		//Thread.sleep(4000);
		//driver.findElement(By.id("flight-departing")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement departingField = wait.until(ExpectedConditions.elementToBeClickable(By.id("flight-departing")));
		departingField.click();
		Thread.sleep(3000);
		WebElement dateToSelect = driver.findElement(By.xpath("//div[@class='datepicker-cal-month'][position()=1]//button[text()='30']"));
		dateToSelect.click();
	}

}
