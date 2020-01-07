package basicweb19;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenElements {
	WebDriver driver;
	String baseUrl1;
	String baseUrl2;


	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl1 = "https://learn.letskodeit.com/p/practice";
		baseUrl2 = "https://www.makemytrip.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

//	@Test
//	public void testLetsKodeIt() {
//		driver.get(baseUrl1);
//		WebElement e = driver.findElement(By.id("displayed-text"));
//		System.out.println(e.isDisplayed());
//		driver.findElement(By.id("hide-textbox")).click();
//		System.out.println(e.isDisplayed());
//		driver.findElement(By.id("show-textbox")).click();
//		System.out.println(e.isDisplayed());
//		e.sendKeys("Test");
//	}
	
	@Test
	public void makeMyTrip() throws InterruptedException{
		driver.get(baseUrl2);
		driver.findElement(By.xpath("//div[@class='makeFlex']//li[3]//span")).click();
		WebElement e = driver.findElement(By.id("toAnotherCity1"));
		System.out.println(e.isDisplayed());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='makeFlex']//li[1]//span")).click();
		System.out.println(e.isDisplayed());
//		System.out.println(driver.findElement(By.id("xx")).isDisplayed());
	}

}
