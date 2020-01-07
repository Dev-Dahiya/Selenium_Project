package testpackage1;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementsDisplayed {
	WebDriver driver;
	String baseURL1;
	String baseURL2;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL1 = "https://letskodeit.teachable.com/p/practice";
		baseURL2 = "http://www.expedia.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@Test
	public void testletskodeit() throws InterruptedException {
		driver.get(baseURL1);
		WebElement textBox = driver.findElement(By.id("displayed-text"));
		System.out.println("Text box is displayed: " + textBox.isDisplayed());

		Thread.sleep(2000);

		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		hideButton.click();
		System.out.println("Clicked Hide Button");
		System.out.println("Text box is displayed: " + textBox.isDisplayed());
		Thread.sleep(2000);

		WebElement showButton = driver.findElement(By.id("show-textbox"));
		showButton.click();
		System.out.println("Clickied Show Button");
		System.out.println("Text box is displayed: " + textBox.isDisplayed());
		Thread.sleep(2000);

	}

	@Test
	public void testexpedia() {
		driver.get(baseURL2);
		
		WebElement dropDown = driver.findElement(By.id("hotel-1-age-select-1"));
		System.out.println("Dropdown is displayed: " + dropDown.isDisplayed());

	}

	@After
	public void tearDown() throws Exception {
	}
}
