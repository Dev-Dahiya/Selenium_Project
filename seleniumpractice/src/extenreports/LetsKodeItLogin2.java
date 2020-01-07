package extenreports;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import page.classes.LetsKodeItHomePage;

public class LetsKodeItLogin2 {
	private WebDriver driver;
	private String baseURL;
	ExtentReports report;
	ExtentTest test; 
	LetsKodeItHomePage hp;

	@BeforeClass
	public void beforeClass() {
		baseURL = "http://www.letskodeit.com/";
		report = new ExtentReports("//Users//devkumar//Desktop//logintest.html");
		test = report.startTest("Verify Welcome Text");
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		hp = new LetsKodeItHomePage(driver, test);
		test.log(LogStatus.INFO, "Browser opened");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		test.log(LogStatus.INFO, "Browser maximized");
		driver.get(baseURL);
		test.log(LogStatus.INFO, "Websited opened");
	}

	@Test
	public void test1_validLoginTest() throws InterruptedException {
		hp.clickSignupLink();
		hp.clickloginLink();
		hp.enterEmail("test@email.com");
		hp.enterPassword("abcabc");
		hp.clickGoButton();
		Thread.sleep(5000);
		
		boolean result = hp.isWelcomeTextPresent();
		Assert.assertTrue(result);
		test.log(LogStatus.PASS, "Verified welcome text");

		
		

		
		
		
	}

	@AfterMethod
	  public void afterMethod(ITestResult testResult) throws IOException {
		  if (testResult.getStatus() == ITestResult.FAILURE) {
			  String path = page.classes.Screenshots.takeScreenshot(driver, testResult.getName());
			  String imagePath = test.addScreenCapture(path);
			  test.log(LogStatus.FAIL, "Verified Welcome Text Failed");
		  }
		  driver.quit();
		  report.endTest(test);
		  report.flush();
	  }

}
