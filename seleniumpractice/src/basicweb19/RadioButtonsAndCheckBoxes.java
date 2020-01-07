package basicweb19;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsAndCheckBoxes {
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
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		WebElement bmwRadio = driver.findElement(By.id("bmwradio"));
		bmwRadio.click();
		System.out.println("Is BMW Radio Button selected: " + bmwRadio.isSelected());

		Thread.sleep(2000);
		bmwRadio.click();
		System.out.println("Is BMW Radio Button selected: " + bmwRadio.isSelected());
		
		Thread.sleep(2000);
		WebElement benzRadio = driver.findElement(By.id("benzradio"));
		benzRadio.click();
		
		Thread.sleep(2000);
		WebElement bmwCheck = driver.findElement(By.id("bmwcheck"));
		bmwCheck.click();
		
		Thread.sleep(2000);
		WebElement benzCheck = driver.findElement(By.id("benzcheck"));
		benzCheck.click();
	}

}
