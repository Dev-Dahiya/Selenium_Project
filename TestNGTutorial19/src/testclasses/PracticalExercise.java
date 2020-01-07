package testclasses;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class PracticalExercise {
	WebDriver driver;
	String baseUrl;

	@BeforeClass
	@Parameters({"browser"})
	public void beforeClass(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		baseUrl = "https://letskodeit.teachable.com/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	@Parameters({"email", "password"})
	public void testLogin(String email, String password) {
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("user_email")).sendKeys(email);
		driver.findElement(By.id("user_password")).sendKeys(password);
		driver.findElement(By.name("commit")).click();
	}

}
