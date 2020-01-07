package testpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageClasses.SearchPageFactory;

public class Grid_ParallelTest {
	WebDriver driver;
	String baseURL;
	SearchPageFactory searchPage;
	String nodeURL;

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		nodeURL = "http://localhost:5555/wd/hub";
		DesiredCapabilities caps = DesiredCapabilities.firefox();
		caps.setBrowserName("firefox");
		caps.setPlatform(Platform.MAC);
		
		driver = new RemoteWebDriver(new URL (nodeURL), caps);
		
		searchPage = new SearchPageFactory(driver);
		baseURL = "https://www.expedia.co.in/";
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@Test
	public void f() {
		searchPage.clickFlightTab();
		searchPage.enterOriginCity("New York");
		searchPage.enterDestinationCity("Chicago");
		searchPage.enterdepartureDate("09/22/2017");
		searchPage.enterReturnDate("09/30/2017");

	}

	@AfterClass
	public void afterClass() {
	}

}
