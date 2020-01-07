package testpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import page.classes.HomePage;

public class TestNGParametersAndDataProviders {
	WebDriver driver;
	String baseURL;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "https://www.expedia.com";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseURL);
		}
	
//	@DataProvider(name= "fieldsInputs")
//	public static Object[][] searchdata() {
//		return new Object[][] {{"New York", "Chicago", "01/05/2017", "05/05/2017"}, {"New York", "Boston", "10/10/2017", "15/10/2017"}};
//	}
	
@Test
  public void searchFlights(String origin, String dest, String depDate, String retDate) {
	HomePage.navigateToFlightsTab(driver);
	HomePage.passvalueToOriginTextBox(driver, origin);
	HomePage.passvalueToDestnationTextBox(driver, dest);
	HomePage.fillvalueTodepartureDateTextBox(driver, depDate);
	HomePage.fillvalueToreturnDateTextBox(driver, retDate);
  }

//@Test (dataProvider = "fieldsInputs")
//public void searchFlightsMultiData(String origin, String dest, String depDate, String retDate) throws InterruptedException {
//	HomePage.navigateToFlightsTab(driver);
//	HomePage.passvalueToOriginTextBox(driver, origin);
//	HomePage.passvalueToDestnationTextBox(driver, dest);
//	HomePage.fillvalueTodepartureDateTextBox(driver, depDate);
//	HomePage.fillvalueToreturnDateTextBox(driver, retDate);
//}
}