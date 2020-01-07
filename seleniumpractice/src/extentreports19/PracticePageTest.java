package extentreports19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class PracticePageTest {
	WebDriver driver;
	String baseUrl;
	ExtentReports report;
	ExtentTest test;
	PracticePageClass pp;
  
  @BeforeClass
  public void beforeClass() {
	  baseUrl = "https://learn.letskodeit.com/p/practice";
	  driver = new FirefoxDriver();
	  report = ExtentFactory.getInstance();
	  test = report.startTest("Practice Page Test");
	  pp = new PracticePageClass(driver, test);
	  driver.manage().window().maximize();
	  test.log(LogStatus.INFO, "Browser maximised!!");
	  driver.get(baseUrl);
	  test.log(LogStatus.INFO, "Web application opened...");
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
	  report.endTest(test);
	  report.flush();
  }
  
  @Test
  public void enterNameTest() {
	  pp.enterName("Dev");
  }

}
