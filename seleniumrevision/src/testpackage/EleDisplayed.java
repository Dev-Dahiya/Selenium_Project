package testpackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EleDisplayed {
	WebDriver driver;
	String baseURL1;
	String baseURL2;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		baseURL1 = "https://letskodeit.teachable.com/p/practice";
		baseURL2 = "https://www.expedia.co.in/";
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void lets() throws InterruptedException {
		driver.get(baseURL1);
		WebElement textbox = driver.findElement(By.id("displayed-text"));
		System.out.println("Is textbox displayed: " +textbox.isDisplayed());
		
		Thread.sleep(3000);
		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		hideButton.click();
		System.out.println("Is textbox displayed: " +textbox.isDisplayed());
		
		Thread.sleep(3000);
		WebElement showButton = driver.findElement(By.id("show-textbox"));
		showButton.click();
		System.out.println("Is textbox displayed: " +textbox.isDisplayed());
		
	}

	@Test
	public void exp() throws InterruptedException {
		/*driver.get(baseURL2);
		WebElement dropDown = driver.findElement(By.id("hotel-1-age-select-1"));
		System.out.println("Is dropdown displayed: " +dropDown.isDisplayed());*/
		
	}
}
