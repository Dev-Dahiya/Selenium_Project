package JavaScriptExecution;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class JScriptExe {
	private WebDriver driver;
	 	String baseURL;
	private JavascriptExecutor js;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "https://letskodeit.teachable.com/pages/practice";
		js = (JavascriptExecutor) driver;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testJScriptExe() throws Exception {
		js.executeScript("window.location = 'https://letskodeit.teachable.com/pages/practice';");
		WebElement textBox1 = (WebElement) js.executeScript("return document.getElementById('name');");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		textBox1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("name")));
		textBox1.sendKeys("Dev Kumar");
		
	}

}
