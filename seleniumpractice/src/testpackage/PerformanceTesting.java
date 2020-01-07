package testpackage;

import org.testng.annotations.Test;
//import org.testng.log4testng.Logger;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

//import java.util.logging.LogManager;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

import page.classes.HomePage;
import page.classes.HomePageFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class PerformanceTesting {
	private WebDriver driver;
	private String baseURL;
	long startTime;
	long endTime;
	long duration;
	double seconds;
	
	
	//private static final Logger log = LogManager.getLogger(NewTest.class.getName());
	
	
	  @Test
  public void fillBasicInfo() {
		  startTime = System.nanoTime();
		  driver.get(baseURL);
		  HomePage.navigateToFlightsTab(driver);
		  HomePage.passvalueToOriginTextBox(driver, "New York");
		  HomePage.passvalueToDestnationTextBox(driver, "Chicago");
		  HomePage.fillvalueTodepartureDateTextBox(driver, "22/10/2017");
		  HomePage.fillvalueToreturnDateTextBox(driver, "23/10/2017");
		  endTime = System.nanoTime();
		  duration = endTime - startTime;
		  seconds = (double)duration / 1000000000.0;
		  System.out.println("Total time taken: " + seconds + " seconds");
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
	  
  }
}
