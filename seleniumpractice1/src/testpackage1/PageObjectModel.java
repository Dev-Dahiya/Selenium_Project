package testpackage1;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import page.classes.HomePage;

public class PageObjectModel {
	private WebDriver driver;
	private String baseURL;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "https://www.expedia.com";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
//		Thread.sleep(3000);
//		driver.quit();
//		
	}

	@Test
	public void test() {
		driver.get(baseURL);
		HomePage.navigateToFlightsTab(driver);
		
		//HomePage.originTextBox(driver).sendKeys("New York");
		HomePage.passvalueToOriginTextBox(driver, "New York");
		
		//HomePage.destinationTextBox(driver).sendKeys("Chicago");
		HomePage.fillvalueToDestnationTextBox(driver, "Chicago");
		
		
		//HomePage.departureDateTextBox(driver).sendKeys("20/10/2017");
		HomePage.fillvalueTodepartureDateTextBox(driver, "25/12/2017");
		
		//HomePage.returnDateTextBox(driver).sendKeys("22/10/2017");
		HomePage.fillvalueToreturnDateTextBox(driver, "25/10/2017");
		
		HomePage.clickSearchButton(driver);
	}

}
