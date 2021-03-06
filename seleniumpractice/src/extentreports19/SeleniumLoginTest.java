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

public class SeleniumLoginTest {
	WebDriver driver;
	String baseUrl;
	ExtentReports report;
	ExtentTest test;
	

	@BeforeClass
	public void beforeClass() {
		baseUrl = "https://www.letskodeit.com/";
		report = new ExtentReports("//Users//devkumar//desktop//ExtentReports//login_test.html");
		test = report.startTest("Verify Successful Login");
		driver = new FirefoxDriver();
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
  public void f() {
	  driver.findElement(By.id("comp-jgmoxws4")).sendKeys(Keys.ESCAPE);
	  driver.findElement(By.id("comp-iiqg1vggactionTitle")).click();
	  test.log(LogStatus.INFO, "Clicked Login/Signup link");
	  driver.findElement(By.id("signUpDialogswitchDialogLink")).click();
	  test.log(LogStatus.INFO, "Clicked Login link");
	  driver.findElement(By.id("memberLoginDialogemailInputinput")).sendKeys("test@email.com");
	  test.log(LogStatus.INFO, "Entered email");
	  driver.findElement(By.id("memberLoginDialogpasswordInputinput")).sendKeys("abcabc");
	  test.log(LogStatus.INFO, "Entered password");
	  driver.findElement(By.id("memberLoginDialogokButton")).click();
	  test.log(LogStatus.INFO, "Clicked Login button");
	  
	  WebElement welcomeText = null;
	  try{
		  welcomeText = driver.findElement(By.xpath("//div[text()='Hello test']"));
	  }
	  catch(NoSuchElementException e){
		  System.out.println("Message from catch block =>" + e.getMessage());
	  }	  
	  if(welcomeText != null){
	  test.log(LogStatus.PASS, "Verified login text");
	  }
	  else test.log(LogStatus.FAIL, "Could not verify login text");
  }

}
