package testpackage;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropAndMulti {
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

	//@Test
	/*public void testMulti() throws InterruptedException {
		driver.get(baseURL1);
		Select sel = new Select(driver.findElement(By.id("multiple-select-example")));
		sel.selectByValue("apple");
		Thread.sleep(2000);
		
		sel.deselectByIndex(0);
		Thread.sleep(2000);
		
		sel.selectByIndex(1);
		Thread.sleep(2000);
		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.deselectAll();
	}*/
	
	@Test
	public void dropDown() throws InterruptedException {
		driver.get(baseURL2);
		Select sel1 = new Select(driver.findElement(By.id("hotel-1-adults")));
		Select sel2 = new Select(driver.findElement(By.id("hotel-1-children")));
		
		sel1.selectByValue("3");
		sel2.selectByIndex(2);
		
		List<WebElement> options = driver.findElements(By.id("hotel-1-adults"));
		int size = options.size();
		System.out.println(size);
		
		for(int i=0; i<size; i++) {
			String optionsValue = options.get(i).getText();
			System.out.println(optionsValue);
		}
		
		
	}
	

}
