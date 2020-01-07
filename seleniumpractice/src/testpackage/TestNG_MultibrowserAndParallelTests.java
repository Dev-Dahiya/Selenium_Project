package testpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import page.classes.HomePage;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;

public class TestNG_MultibrowserAndParallelTests {
	private WebDriver driver;
	private String baseURL;
	

@Parameters("browserType")
@BeforeClass
public void beforeClass(String browserType) {
	if (browserType.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		  driver = new FirefoxDriver();
	} else if (browserType.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "/Users/devkumar/Documents/workspace/chromedriver");
		  driver = new ChromeDriver();
		
	}
	
		  
		  baseURL = "https://www.expedia.com";
		  //driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.get(baseURL);
}

@Test
  public void searchFlights() {
	  HomePage.navigateToFlightsTab(driver);
	  HomePage.passvalueToOriginTextBox(driver, "New York");
	  HomePage.passvalueToDestnationTextBox(driver, "Chicago");
	  HomePage.fillvalueTodepartureDateTextBox(driver, "05/05/2017");
	  HomePage.fillvalueToreturnDateTextBox(driver, "10/05/2017");
  }
  
	  
  

	@AfterClass
	public void afterClass() throws InterruptedException {
//		Thread.sleep(10);
//		driver.quit();
	}

}
