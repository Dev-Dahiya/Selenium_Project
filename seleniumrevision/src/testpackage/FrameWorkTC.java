package testpackage;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageClasses.SearchPageFactory;

public class FrameWorkTC {
	WebDriver driver;
	String baseURL;
	SearchPageFactory searchPage;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		searchPage = new SearchPageFactory(driver);
		baseURL = "https://www.expedia.co.in/";
		driver.get(baseURL);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		searchPage.clickFlightTab();
		searchPage.enterOriginCity("New York");
		searchPage.enterDestinationCity("Chicago");
		searchPage.enterdepartureDate("09/22/2017");
		searchPage.enterReturnDate("09/30/2017");
	}

}
