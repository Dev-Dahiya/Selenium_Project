package basicweb19;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import basicweb19.GenericMethods;

public class FindLinks {
	WebDriver driver;
	String baseUrl;
	GenericMethods gm;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		gm = new GenericMethods(driver);
		baseUrl = "https://www.expedia.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	public void test() {
		driver.findElement(By.id("tab-flight-tab-hp")).click();
		List<WebElement> links = gm.getAllClickableLinks();
		for(WebElement link : links){
			String href = link.getAttribute("href");
			try {
			String linkStatus = gm.checkLinkStatus(new URL(href));
			System.out.println("URL: " + href + " Status: " + linkStatus);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}

}
