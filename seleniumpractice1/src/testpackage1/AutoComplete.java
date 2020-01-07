package testpackage1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoComplete {
private WebDriver driver;
private String baseURL;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "http://www.southwest.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		String searchText = "New York (LaGuardia), NY - LGA";
		String partialText = "new";
		WebElement texti = driver.findElement(By.id("air-city-departure"));
		texti.sendKeys(partialText);
		
		WebElement textInDiv = driver.findElement(By.xpath("//div[@id='js-menu-wrapper']"));
		
		List <WebElement> results = textInDiv.findElements(By.tagName("li"));
		int size = results.size();
		
		for (int i=0; i < size; i++) {
			System.out.println(results.get(i).getText());
		}
		
		Thread.sleep(3000);
		
		for (WebElement result : results) {
			if (result.getText().equals(searchText)) {
				result.click();
			}
			
		}
		
		
	}

}
