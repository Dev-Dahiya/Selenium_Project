package testpackage1;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import page.classes.HomePage;
import page.classes.HomePageFactory;

public class FramewordTestCase {
	private WebDriver driver;
	private String baseURL;
	//HomePageFactory homePage;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "http://www.expedia.com";
		//homePage = new HomePageFactory(driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get(baseURL);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
//		homePage.clickFlightTab();
//		homePage.setOriginCity("New York");
//		homePage.setDestinationCity("Chicago");
//		homePage.setDepartureDate("22/12/2017");
//		homePage.setRetureDate("25/12/2017");
		HomePage.navigateToFlightsTab(driver);
		HomePage.passvalueToOriginTextBox(driver, "New York");
		HomePage.fillvalueToDestnationTextBox(driver, "Chicago");
		HomePage.fillvalueTodepartureDateTextBox(driver, "01/05/2017");
		HomePage.fillvalueToreturnDateTextBox(driver, "05/05/2017");
	}

}
