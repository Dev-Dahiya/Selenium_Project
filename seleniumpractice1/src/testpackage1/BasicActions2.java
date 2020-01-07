package testpackage1;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicActions2 {
	WebDriver driver;
	String baseURL = "http://automationpractice.com/index.php";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() {
		driver.get(baseURL);
		driver.findElement(By.xpath("//header[@id='header']/div[2]//a[@class='login']")).click();;
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@email.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[@id='email']")).clear();
	}

}
