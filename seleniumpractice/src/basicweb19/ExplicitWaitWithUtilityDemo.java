package basicweb19;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import basicweb19.GenericMethods;

public class ExplicitWaitWithUtilityDemo {
	WebDriver driver;
	String baseUrl;
	GenericMethods gm;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://learn.letskodeit.com/p/practice";
		driver.manage().window().maximize();
		gm = new GenericMethods(driver);
		driver.get(baseUrl);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	public void elementList() throws InterruptedException {
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		loginLink.click();
		
		WebElement emailField = gm.waitForElement(By.id("user_email"), 8, "elementtobeclickable");
		if(emailField != null) emailField.sendKeys("testing");		
	}

}
