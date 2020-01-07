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

public class ExplicitWaitDemo {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://learn.letskodeit.com/p/practice";
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		System.out.println("Ran after method");
		driver.quit();
	}

	@Test
	public void elementList() throws InterruptedException {
//		WebElement loginLink = driver.findElement(By.linkText("Login"));
//		loginLink.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement emailField = wait.until
				(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
		emailField.sendKeys("testing");
		driver.findElement(By.id("alertbtn")).click();
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
	}

}
