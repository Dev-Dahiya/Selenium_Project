package keypress19;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyPressDemo3 {
	WebDriver driver;
	String baseUrl;
	Actions action;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://jqueryui.com/selectable/";
		action = new Actions(driver);
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
		driver.switchTo().frame(0);
		List<WebElement> elements = driver.findElements(By.xpath("//ol[@id='selectable']//li"));
		
		action.keyDown(Keys.COMMAND).build().perform();
		
		for(WebElement e : elements) {
			e.click();
			Thread.sleep(1000);
		}
		
		action.keyUp(Keys.COMMAND).build().perform();
		
	}

}
