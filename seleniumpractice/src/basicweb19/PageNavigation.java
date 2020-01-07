package basicweb19;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageNavigation {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://letskodeit.teachable.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		
		String url = driver.getCurrentUrl();
		System.out.println("Current url is: " + url);
		
		String urlToNavigate = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
		driver.navigate().to(urlToNavigate);
		
		url = driver.getCurrentUrl();
		System.out.println("Current url is: " + url);
		
		Thread.sleep(3000);
		driver.navigate().back();
		url = driver.getCurrentUrl();
		System.out.println("Current url is: " + url);
		Thread.sleep(3000);
		driver.navigate().forward();
		url = driver.getCurrentUrl();
		System.out.println("Current url is: " + url);
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.get(driver.getCurrentUrl());
		Thread.sleep(3000);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		

	}

}
