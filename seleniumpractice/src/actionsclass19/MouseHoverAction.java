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

public class MouseHoverAction {
	WebDriver driver;
	String baseUrl;
	JavascriptExecutor js;
	Actions action;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://learn.letskodeit.com/p/practice";
		js = (JavascriptExecutor)driver;
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
		js.executeScript("window.scrollBy(0, 600)");
		
		WebElement mouseHover = driver.findElement(By.id("mousehover"));
		action.moveToElement(mouseHover).build().perform();
		Thread.sleep(2000);
		
		WebElement top = driver.findElement(By.xpath("//div[@class='mouse-hover-content']//a[text()='Top']"));
		action.moveToElement(top).click().build().perform();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0, 600)");
		action.moveToElement(mouseHover).perform();
		Thread.sleep(2000);
		
		WebElement reload = driver.findElement(By.xpath("//div[@class='mouse-hover-content']//a[text()='Reload']"));
		action.moveToElement(reload).click().perform();
	}

}
