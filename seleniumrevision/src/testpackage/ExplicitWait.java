package testpackage;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.WaitTypes;

public class ExplicitWait {
	static WebDriver driver;
	static String baseURL;
	static WaitTypes wt;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		baseURL = "http://letskodeit.teachable.com/";
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		wt = new WaitTypes(driver);
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(4000);
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		driver.findElement(By.xpath("//div[@id='navbar']//div/ul/li[2]/a")).click();
		
		
		WebElement textBox = wt.waitForElement(By.id("user_email"), 3);
		textBox.sendKeys("test@email.com");
		
		//driver.findElement(By.id("user_email")).sendKeys("test@mail.com");
		/*driver.findElement(By.id("user_password")).sendKeys("test");
		Thread.sleep(4000);
		driver.findElement(By.id("user_email")).clear();
*/		
		wt.clickWhenReady(By.name("commit"), 3);
	
	}

}
