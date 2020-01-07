package basicweb19;

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
import org.openqa.selenium.support.ui.Select;

public class Multiselect {
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
		WebElement multiSelect = driver.findElement(By.id("multiple-select-example"));
		Select sel = new Select(multiSelect);
		sel.selectByValue("apple");
		Thread.sleep(2000);
		
		sel.selectByIndex(1);
		Thread.sleep(2000);

		sel.selectByVisibleText("Peach");
		Thread.sleep(2000);
		
//		sel.deselectAll();
		
		WebElement firstElement = sel.getFirstSelectedOption();
		System.out.println(firstElement.getText());
		
		List<WebElement> options = sel.getAllSelectedOptions();
		for(int i=0; i<options.size(); i++){
			System.out.println(options.get(i).getText());
		}
		
		sel.deselectByIndex(0);
		Thread.sleep(2000);

		sel.deselectByValue("orange");
		Thread.sleep(2000);

//		sel.deselectByVisibleText("Peach");
			
//		List<WebElement> options = sel.getOptions();
//		for(int i=0; i<options.size(); i++){
//			System.out.println(options.get(i).getText());
//		}
		
	}

}
