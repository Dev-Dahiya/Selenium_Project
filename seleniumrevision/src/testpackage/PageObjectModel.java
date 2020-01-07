package testpackage;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageClasses.searchPage;

public class PageObjectModel {
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		baseURL = "https://www.expedia.co.in/";
		driver.get(baseURL);
		driver.findElement(By.id("tab-flight-tab")).click();
		Thread.sleep(4000);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(4000);
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		searchPage.fillOriginTextBox(driver, "New York");
		Thread.sleep(2000);
		searchPage.fillDestinationTextBox(driver, "Chicago");
		Thread.sleep(2000);
		searchPage.fillDepartureDate(driver, "09/22/2017");
		Thread.sleep(2000);
		searchPage.fillReturnDate(driver, "09/25/2017");
		Thread.sleep(2000);
		searchPage.clickSearchButton(driver);
		
	}

}
