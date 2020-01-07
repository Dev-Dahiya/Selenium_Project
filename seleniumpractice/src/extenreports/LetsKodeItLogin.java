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

public class LetsKodeItLogin {
	private WebDriver driver;
	private String baseURL;
	ExtentReports report;
	ExtentTest test;

	@BeforeClass
	public void beforeClass() {
		baseURL = "http://www.letskodeit.com/";
		report = new ExtentReports("//Users//devkumar//Desktop//logintest.html");
		test = report.startTest("Verify Welcome Text");
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		test.log(LogStatus.INFO, "Browser opened");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		test.log(LogStatus.INFO, "Browser maximized");
		driver.get(baseURL);
		test.log(LogStatus.INFO, "Websited opened");
	}

	@Test
	public void test1_validLoginTest() throws InterruptedException {
		WebElement signupLink = driver.findElement(By.id("comp-iiqg1vggactionTitle"));
		signupLink.click();
		test.log(LogStatus.INFO, "Clicked Signup link");

		WebElement loginLink = driver.findElement(By.id("signUpDialogswitchDialogLink"));
		loginLink.click();
		test.log(LogStatus.INFO, "Clicked Login link");

		WebElement emailField = driver.findElement(By.id("memberLoginDialogemailInputinput"));
		emailField.sendKeys("test@email.com");
		test.log(LogStatus.INFO, "Email entered");

		WebElement passwordField = driver.findElement(By.xpath("//input[@id='memberLoginDialogpasswordInputinput']"));
		passwordField.sendKeys("abcabc");
		test.log(LogStatus.INFO, "Password entered");

		WebElement goButton = driver.findElement(By.id("memberLoginDialogoklink"));
		goButton.click();
		test.log(LogStatus.INFO, "Clicked Go button");
		Thread.sleep(5000);

		WebElement welcomeText = null;

		try {
			welcomeText = driver.findElement(By.xpath("//div[text()='Hello test1@email.com']"));
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		Assert.assertTrue(welcomeText != null);
		test.log(LogStatus.PASS, "Verified Welcome Text");
		
		
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
