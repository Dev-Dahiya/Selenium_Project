package testpackage1;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonAndCheckboxes {
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
		bmwRadioBtn.click();
		
		Thread.sleep(2000);
		WebElement benzRadiobtn = driver.findElement(By.id("benzradio"));
		benzRadiobtn.click();
		
		Thread.sleep(2000);
		WebElement bmwCheckbox = driver.findElement(By.id("bmwcheck"));
		bmwCheckbox.click();
		Thread.sleep(2000);
	
		WebElement benzCheckbox = driver.findElement(By.id("benzcheck"));
		benzCheckbox.click();
		
		System.out.println("BMW Radio button is selected? " + bmwRadioBtn.isSelected());
		System.out.println("Benz Radio button is selected? " + benzRadiobtn.isSelected());
		System.out.println("BMW Checkbox is selected? " + bmwCheckbox.isSelected());
		System.out.println("Benz Checkbox is selected? " + bmwCheckbox.isSelected());
	}
	
	

	@After
	public void tearDown() throws Exception {
	}
}
