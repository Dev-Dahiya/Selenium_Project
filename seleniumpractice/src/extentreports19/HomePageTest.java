package extentreports19;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeClass;

import org.openqa.selenium.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class HomePageTest {
	WebDriver driver;
	String baseUrl;
	ExtentReports report;
	ExtentTest test;
	HomePageClass hp;

	@BeforeClass
	public void beforeClass() {
		baseUrl = "https://www.letskodeit.com/";
		report = ExtentFactory.getInstance();
		test = report.startTest("Verify Successful Login");
		driver = new FirefoxDriver();
		hp = new HomePageClass(driver, test);
		test.log(LogStatus.INFO, "Browser started...");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Browser maximized...");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
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
	public void loginTest() {
		hp.pressEscape();
		hp.clickSignupLink();
		hp.clickLoginLink();
		hp.enterEmail("test@email.com");
		hp.enterPassword("abcabc");
		hp.clickLoginButton();
		boolean result = hp.isWelcomeTextPresent();
		Assert.assertTrue(result);
	}

}
