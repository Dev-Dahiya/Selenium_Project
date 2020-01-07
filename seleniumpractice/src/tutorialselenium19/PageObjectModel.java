package tutorialselenium19;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageclasses19.SearchPage;

public class PageObjectModel {
	WebDriver driver;
	String baseUrl;
	SearchPage sp;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		sp = new SearchPage(driver);
		baseUrl = "https://www.expedia.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	public void test() {
		sp.clickFlightsTab();
		sp.fillOriginCity("New York");
		sp.fillDestCity("Chicago");
		sp.fillDepartDate("09/15/2019");
		sp.getReturnDateTextBox().clear();
		sp.fillReturnDate("09/20/2019");
		sp.clickSearchButton();
		
	}

}
