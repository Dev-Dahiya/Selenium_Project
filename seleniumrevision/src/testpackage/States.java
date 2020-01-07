package testpackage;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class States {
	WebDriver driver;
	String baseURL;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "https://www.google.co.in";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		driver.get(baseURL);
		WebElement e1 = driver.findElement(By.id("gs_htif0"));
		System.out.println("E1 is enabled? " +e1.isEnabled());
		
		WebElement e2 = driver.findElement(By.id("gs_taif0"));
		System.out.println("E2 is enabled? " +e2.isEnabled());
		
		WebElement e3 = driver.findElement(By.id("lst-ib"));
		System.out.println("E3 is enabled? " +e3.isEnabled());
	}

}
