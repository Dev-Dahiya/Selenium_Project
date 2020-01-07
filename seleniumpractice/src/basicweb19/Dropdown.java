package basicweb19;

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

public class Dropdown {
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
		WebElement dropdown = driver.findElement(By.id("carselect"));
		Select sel = new Select(dropdown);
		sel.selectByVisibleText("Honda");
		Thread.sleep(2000);
		
		sel.selectByValue("benz");
		Thread.sleep(2000);
		
		sel.selectByIndex(0);
		
		List<WebElement> options = sel.getOptions();
		int size = options.size();
		
		for(int i=0; i<size; i++){
			String optionValue = options.get(i).getText();
			System.out.println(optionValue);
		}
	}

}
