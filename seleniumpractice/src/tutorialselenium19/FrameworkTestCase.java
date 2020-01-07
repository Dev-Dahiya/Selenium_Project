package tutorialselenium19;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageclasses19.SearchPageFactory;;

public class FrameworkTestCase {
	WebDriver driver;
	String baseUrl;
	SearchPageFactory searchPage;
	

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		searchPage = new SearchPageFactory(driver);
		baseUrl = "https://www.expedia.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
//		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		searchPage.clickFlightTab();
		searchPage.listSize();
		searchPage.enterOriginCity("New York");
		searchPage.enterDestCity("Chicago");
		searchPage.enterDepartDate("09/20/2019");
		searchPage.enterReturnDate("09/23/2019");
		searchPage.clickSearchButton();

	}

}
