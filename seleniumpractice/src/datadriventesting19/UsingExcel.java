package datadriventesting19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsingExcel {
	WebDriver driver;
	ExcelUtility eu;

	@DataProvider(name = "loginData")
	public Object[][] dp() {
		Object[][] testData = eu.getTestData("Invalid_Login");
		return testData;
	}

	@BeforeClass
	public void beforeClass() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.letskodeit.com/");
		eu = new ExcelUtility(
				"/Users/devkumar/Documents/workspace/seleniumpractice/src" + "/datadriventesting19/ExcelTestData.xls",
				"loginTest");
		driver.findElement(By.id("comp-jgmoxws4")).sendKeys(Keys.ESCAPE);
		driver.findElement(By.id("comp-iiqg1vggactionTitle")).click();
		driver.findElement(By.id("signUpDialogswitchDialogLink")).click();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test(dataProvider = "loginData")
	public void invalidLoginTest(String email, String password) throws InterruptedException {
		WebElement emailField = driver.findElement(By.id("memberLoginDialogemailInputinput"));
		emailField.sendKeys(email);
		WebElement passwordField = driver.findElement(By.id("memberLoginDialogpasswordInputinput"));
		passwordField.sendKeys(password);
		driver.findElement(By.id("memberLoginDialogokButton")).click();
		Thread.sleep(3000);
		WebElement errorMsg = driver.findElement(By.id("memberLoginDialogpasswordInputerrorMessage"));
		boolean result = errorMsg.getText().equals("Wrong email or password");
		Assert.assertTrue(result);
		emailField.clear();
		passwordField.clear();
		Thread.sleep(2000);
	}

}
