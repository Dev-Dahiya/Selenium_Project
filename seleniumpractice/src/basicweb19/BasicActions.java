package basicweb19;


import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicActions {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://letskodeit.teachable.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		driver.findElement(By.xpath("//div[@id='navbar']//a[contains(text(),'Login')]")).click();
		System.out.println("clicked login link");
		driver.findElement(By.id("user_email")).sendKeys("test@email.com");
		System.out.println("entered email");
		driver.findElement(By.id("user_password")).sendKeys("test");
		System.out.println("entered password");
		Thread.sleep(3000);
		driver.findElement(By.id("user_email")).clear();
		System.out.println("cleared email");
		Thread.sleep(3000);
	}
	
	}
