package actionsclass;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {
	private WebDriver driver;
	private String baseURL;
	JavascriptExecutor js;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		js = (JavascriptExecutor) driver;
		
		baseURL = "https://letskodeit.teachable.com/p/practice";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		WebElement mainButton = driver.findElement(By.id("mousehover"));
		js.executeScript("arguments[0].scrollIntoView(true);", mainButton);
		js.executeScript("window.scrollBy(0, -190)");
		
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
		action.moveToElement(mainButton).perform();
		Thread.sleep(3000 );
		
		WebElement subButton = driver.findElement(By.xpath("//div[@class='mouse-hover-content']//a[text()='Top']"));
		action.moveToElement(subButton).click().perform();
		
	}

}
