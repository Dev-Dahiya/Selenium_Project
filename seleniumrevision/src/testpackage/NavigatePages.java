package testpackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigatePages {
	String baseURL;
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "https://letskodeit.teachable.com/";
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		String title = driver.getTitle();
		System.out.println("page title is: " + title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("current url is: " + currentUrl);
		
		String urlToNavigate = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
		driver.navigate().to(urlToNavigate);
		Thread.sleep(2000);
		currentUrl = driver.getCurrentUrl();
		System.out.println("current url is: " +currentUrl);
		
		driver.navigate().back();
		Thread.sleep(2000);
		currentUrl = driver.getCurrentUrl();
		System.out.println("current url is: " +currentUrl);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		currentUrl = driver.getCurrentUrl();
		System.out.println("current url is: " +currentUrl);
		
		driver.navigate().back();
		currentUrl = driver.getCurrentUrl();
		System.out.println("current url is: " +currentUrl);
		Thread.sleep(2000);
		driver.navigate().refresh();
		System.out.println("page refresh");
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
	}

}
