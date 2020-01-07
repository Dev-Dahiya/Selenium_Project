package testpackage;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchAlert {
	WebDriver driver;
	String baseURL;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		baseURL = "https://letskodeit.teachable.com/p/practice";
		driver.get(baseURL);

	}

	@After
	public void tearDown() throws Exception {
		/*Thread.sleep(3000);
		driver.quit();*/
	}

	@Test
	public void test1() throws InterruptedException {
		driver.findElement(By.id("name")).sendKeys("Dev Kumar Ji");
		driver.findElement(By.id("alertbtn")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
	}
	@Test
	public void test2() throws InterruptedException {
		driver.findElement(By.id("name")).sendKeys("Dev Kumar Ji");
		driver.findElement(By.id("confirmbtn")).click();
		Alert alert = driver.switchTo().alert();
		alert.getText();
		Thread.sleep(3000);
		alert.dismiss();
		
		
		
	}	

}
