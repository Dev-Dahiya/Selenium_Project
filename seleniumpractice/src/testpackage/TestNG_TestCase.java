package testpackage;

import org.testng.annotations.Test;

import page.classes.HomePage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class TestNG_TestCase {
	private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}
	private String baseURL;
	
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
	  driver = new FirefoxDriver();
	  baseURL = "http://www.expedia.com";
	  
	  driver.manage().window().maximize();
	  }
  
  @BeforeMethod
  public void beforeMethod() {
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }
  
  @Test
  public void testMethod() {
	  driver.get(baseURL);
	  HomePage.navigateToFlightsTab(driver);
	  HomePage.passvalueToOriginTextBox(driver, "New York");
	  HomePage.passvalueToDestnationTextBox(driver, "Chicago");
	  }
  @Test
  public void testMethod1() {
	  HomePage.fillvalueTodepartureDateTextBox(driver, "10/05/2017");
	  HomePage.fillvalueToreturnDateTextBox(driver, "15/05/2017");
  }
  @AfterClass
  public void afterClass() {
  }

}
