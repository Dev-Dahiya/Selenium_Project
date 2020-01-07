package waitTypes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExWait {
private WebDriver driver;
private String baseURL;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "https://letskodeit.teachable.com/pages/practice";
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		driver.get(baseURL);
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		loginLink.click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
		emailField.sendKeys("test");
		
		//driver.findElement(By.id("user_email"));
	}

}
