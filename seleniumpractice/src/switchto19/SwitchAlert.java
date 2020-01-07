package switchto19;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchAlert {
	public static WebDriver driver;
	public static String baseUrl;
	public static Alert alert;

	@BeforeClass
	public static void setUpClass() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://learn.letskodeit.com/p/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	public void test1() throws InterruptedException {
		driver.findElement(By.id("name")).sendKeys("Dev");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
	}

	@Test
	public void test2() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Raj");
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
//		alert.accept();
		alert.dismiss();
	}
}