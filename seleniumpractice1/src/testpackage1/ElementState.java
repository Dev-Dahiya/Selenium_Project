package testpackage1;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementState {
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "http://google.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		WebElement e1 = driver.findElement(By.id("lst-ib"));
		System.out.println(e1.isEnabled());
		
		WebElement e2 = driver.findElement(By.id("gs_taif0"));
		System.out.println(e2.isEnabled());
		e2.sendKeys("letskodeit");

		
		WebElement e3 = driver.findElement(By.id("gs_htif0"));
		System.out.println(e3.isEnabled());
		

	}

}
