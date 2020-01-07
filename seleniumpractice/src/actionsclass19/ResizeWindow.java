package actionsclass19;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class ResizeWindow {
	WebDriver driver;
	String baseUrl;
	Actions action;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://jqueryui.com/resizable/";
		action = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//div[@id='resizable']//div[3]"));
		
		action.clickAndHold(element).moveByOffset(200, 100).release().build().perform();
		Thread.sleep(2000);
		action.clickAndHold(element).moveByOffset(-100, -50).release().build().perform();
		
	}

}
