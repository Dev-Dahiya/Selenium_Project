package keypress19;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyPressDemo1 {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://learn.letskodeit.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(4000);
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("user_email")).sendKeys("test@email.com");
		Thread.sleep(2000);
		driver.findElement(By.id("user_password")).sendKeys("123123");
		Thread.sleep(2000);
//		driver.findElement(By.name("commit")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("user_password")).sendKeys(Keys.RETURN);
	}

}
