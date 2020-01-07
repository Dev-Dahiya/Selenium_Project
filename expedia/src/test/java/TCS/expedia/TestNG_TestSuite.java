package TCS.expedia;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import pageClasses.SearchPageFactory;

public class TestNG_TestSuite {
	WebDriver driver;
	String baseURL;
	SearchPageFactory search;
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "https://www.expedia.co.in";
		driver.manage().window().maximize();
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @Test
  public void f() {
	  search.clickFlightTab();
	  search.enterOriginCity("New York");
	  search.enterDestinationCity("Chicago");
	  search.enterdepartureDate("29/09/2017");
	  search.enterReturnDate("30/09/2017");
  }
  
  @AfterClass
  public void afterClass() {
  }

}
