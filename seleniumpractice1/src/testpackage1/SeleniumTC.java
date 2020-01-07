package testpackage1;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTC {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		
		baseUrl = "http://www.letskodeit.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testSeleniumTC() throws Exception {
		driver.get(baseUrl + "/");
		driver.findElement(By.id("i90scv3glabel")).click();
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Practice")).click();
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}
}
