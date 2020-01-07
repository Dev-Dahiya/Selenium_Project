package testpackage1;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateBetweenPages {
	WebDriver driver;
	String baseURL;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "http://letskodeit.teachable.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		
		String title = driver.getTitle();
		System.out.println("Page title is: " +title);
		
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentURL);
		
		String urlTonavigate = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
		
		driver.navigate().to(urlTonavigate);
		currentURL = driver.getCurrentUrl();
		System.out.println("URL of navigated page (login page) is: " + currentURL);
		Thread.sleep(3000);
		
		
		driver.navigate().back();
		currentURL = driver.getCurrentUrl();
		System.out.println("Clicking back from login page: " + currentURL);
		Thread.sleep(3000);
		
		driver.navigate().forward();
		currentURL = driver.getCurrentUrl();
		System.out.println("Clicking forward from homepage: " + currentURL);
		Thread.sleep(3000);
		
		driver.navigate().back();
		currentURL = driver.getCurrentUrl();
		System.out.println("Clicking back again from login page: " + currentURL);
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		System.out.println("Page gets refreshed");
		driver.get(currentURL);
		System.out.println("Page gets refreshed again");
		
		String pageSource = driver.getPageSource();
		System.out.println("Page source is: " + pageSource);

	}
	
	@After
	public void tearDown() throws Exception {
	}
}
