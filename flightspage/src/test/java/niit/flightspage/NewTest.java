package niit.flightspage;

//import java.util.logging.LogManager;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.classes.HomePage;



public class NewTest {
	private WebDriver driver;
	private String baseURL;
	
	
	//private static final Logger log = LogManager.getLogger(NewTest.class.getName());
	
	
	  @Test
  public void fillBasicInfo() {
		  HomePage.navigateToFlightsTab(driver);
		  HomePage.passvalueToOriginTextBox(driver, "New York");
		  HomePage.passvalueToDestnationTextBox(driver, "Chicago");
		  HomePage.fillvalueTodepartureDateTextBox(driver, "22/10/2017");
		  HomePage.fillvalueToreturnDateTextBox(driver, "23/10/2017");
		   }
	  
//	  @Test(dependsOnMethods={ "fillBasicInfo" })
//	 public void ClickModifySearchLink() {
//		  HomePage.clickModifySearchLink(driver);
//		   }
	  
	  
	  
  @BeforeMethod
  public void beforeMethod() {
	  	  
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
	  driver = new FirefoxDriver();
	  baseURL = "https://www.expedia.com";
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  driver.get(baseURL);
  }
}
