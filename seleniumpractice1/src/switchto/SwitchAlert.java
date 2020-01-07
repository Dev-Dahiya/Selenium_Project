package switchto;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchAlert {
	private WebDriver driver;
	private String baseURL;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseURL);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	public void test1() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("Dev");
		driver.findElement(By.id("alertbtn")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
	}
	
	@Test
	public void test2() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("Anil");
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(3000);
		Alert confirm = driver.switchTo().alert();
		//confirm.accept();
		confirm.dismiss();
	}
}
