package testpackage;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import page.classes.Screenshots;

public class TestNG_Screenshots {
	private WebDriver driver;
	private String baseURL;
	
	@BeforeMethod
	  public void beforeMethod() {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "http://www.letskodeit.com/";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseURL);
	  }
	
  @Test
  public void test1_invalidCredentials() {
	  WebElement signupLink = driver.findElement(By.id("comp-iiqg1vggactionTitle"));
	  signupLink.click();
	  
	  WebElement loginLink = driver.findElement(By.id("signUpDialogswitchDialogLink"));
	  loginLink.click();
	  
	  WebElement emailField = driver.findElement(By.id("memberLoginDialogemailInputinput"));
	  emailField.sendKeys("abc@test.com");
	  
	  WebElement passwordField = driver.findElement(By.xpath("//input[@id='memberLoginDialogpasswordInputinput']"));
	  passwordField.sendKeys("123456");
	  
	  WebElement goButton = driver.findElement(By.id("memberLoginDialogoklink"));
	  goButton.click();
	  
	  WebElement welcomeText = null;
	  
	  try {
		  welcomeText = driver.findElement(By.xpath("//div[text()='Hello test@email.com']"));
	  }
	  catch (NoSuchElementException e) {
		  System.out.println(e.getMessage());
	  }
	  Assert.assertTrue(welcomeText != null);
  }
  @AfterMethod
  public void afterMethod(ITestResult testResult) throws IOException {
	  if (testResult.getStatus() == ITestResult.FAILURE) {
		  page.classes.Screenshots.takeScreenshot(driver, testResult.getName());
	  }
	  driver.quit();
  }

  }
