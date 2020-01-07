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

public class ElementList {
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		baseURL = "https://letskodeit.teachable.com/p/practice";
		driver.get(baseURL);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		List<WebElement> radioButtons = driver.findElements(By.xpath("//input[contains(@type,'radio') and contains(@name,'cars')]"));
		int size = radioButtons.size();
		boolean isChecked = false;
		for (int i=0; i < size; i++ ) {
			isChecked = radioButtons.get(i).isSelected();
			
			if(!isChecked) {
				radioButtons.get(i).click();
				Thread.sleep(2000);
			}
			
			
		}
		
	}

}
