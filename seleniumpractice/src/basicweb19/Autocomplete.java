package basicweb19;

import static org.junit.Assert.*;
import basicweb19.GenericMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autocomplete {
	WebDriver driver;
	String baseURl;
	GenericMethods gm;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURl = "https://www.expedia.com/";
		gm = new GenericMethods(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get(baseURl);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(4000);
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		gm.getElement("id", "tab-flight-tab-hp").click();
		String partialText = "Manc";
		String textToSelect = "BNA-Nashville Intl.";
		WebElement searchBox = driver.findElement(By.id("flight-origin-hp-flight"));
		searchBox.sendKeys(partialText);
		Thread.sleep(3000);
		// Method One
//		WebElement optionToSelect = driver.findElement(By.id("aria-option-6"));
//		optionToSelect.click();
//		System.out.println("clicked the element");
		
		// Method Two
		WebElement flyOut = driver.findElement(By.id("typeaheadDataPlain"));
		List<WebElement> options = flyOut.findElements(By.tagName("a"));
		
		for(WebElement option : options){
			System.out.println(option.getAttribute("data-value"));
			if(option.getAttribute("data-value").contains(textToSelect)){
				option.click();
//				option.click();
				System.out.println("clicked the element");
			}
		}	
	}
}
