package testpackage1;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithElementList {
	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
	System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
	driver = new FirefoxDriver();
	baseURL = "https://letskodeit.teachable.com/p/practice";
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(baseURL);
	}

	@Test
	public void test() throws InterruptedException {
		boolean isChecked = false;
		//List<WebElement> radioButtons = driver.findElements(By.xpath("//input[contains(@type,'radio') and contains(@name,'cars')]"));
		List<WebElement> radioButtons = driver.findElements(By.name("cars"));
		int size = radioButtons.size();
		System.out.println("Size of the list is: " + size);
		for (int i=0; i<size; i++) {
			isChecked = radioButtons.get(i).isSelected();
			
			if (!isChecked) {
				radioButtons.get(i).click();
				Thread.sleep(3000);
			}
		}
 
}
	
	
	@After
	public void tearDown() throws Exception {
	}
}
