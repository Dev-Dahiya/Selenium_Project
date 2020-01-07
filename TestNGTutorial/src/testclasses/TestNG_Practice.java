package testclasses;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestNG_Practice {
	WebDriver driver;
	String baseURL;

	@BeforeClass
	@Parameters({ "browser" })
	public void setUp(String browser) {
		baseURL = "https://letskodeit.teachable.com/";
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/devkumar/Documents/workspace/chromedriver");
			driver = new ChromeDriver();
		}
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testMethod() {
		driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
		driver.findElement(By.id("user_email")).sendKeys("user_email");
		driver.findElement(By.id("user_password")).sendKeys("abcabc");
		driver.findElement(By.name("commit")).click();

	}
}
