package testpackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class RadioAndCheck {
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice";
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		WebElement bmwRadio = driver.findElement(By.id("bmwradio"));
		bmwRadio.click();
		
		Thread.sleep(2000);
		WebElement benzRadio = driver.findElement(By.id("benzradio"));
		benzRadio.click();
		
		Thread.sleep(2000);
		WebElement hondaRadio = driver.findElement(By.id("hondaradio"));
		hondaRadio.click();
		
		Thread.sleep(2000);
		WebElement bmwCheck = driver.findElement(By.id("bmwcheck"));
		bmwCheck.click();
		
		Thread.sleep(2000);
		WebElement benzCheck = driver.findElement(By.id("benzcheck"));
		benzCheck.click();
		
		Thread.sleep(2000);
		WebElement hondaCheck = driver.findElement(By.id("hondacheck"));
		hondaCheck.click();
		
		System.out.println("Is BMW Radio button selected? " +bmwRadio.isSelected());
		System.out.println("Is Benz Radio button selected? " +benzRadio.isSelected());
		System.out.println("Is Honda Radio button selected? " +hondaRadio.isSelected());
		System.out.println("Is BMW Checkbox button selected? " +bmwCheck.isSelected());
		System.out.println("Is Benz Checkbox button selected? " +benzCheck.isSelected());
		System.out.println("Is Honda Checkbox button selected? " +hondaCheck.isDisplayed());
		
	}

}
