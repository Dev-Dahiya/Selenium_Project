package switchto19;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchWindow {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://learn.letskodeit.com/p/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

//	@Test
	public void test1() throws InterruptedException {
		// Get the parent window handle
		String parentHandle = driver.getWindowHandle();
		System.out.println("Parent Handle: " + parentHandle);
		
//		WebElement openWindow = driver.findElement(By.id("openwindow"));
//		openWindow.click();
		
		WebElement openTab = driver.findElement(By.id("opentab"));
		openTab.click();
		Thread.sleep(3000);
		
		// Get all handles
		Set<String> handles = driver.getWindowHandles();
		
		// Switching between handles
		for(String handle : handles){
			System.out.println(handle);
			if(!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				break;
			}
		}
		WebElement searchBox = driver.findElement(By.id("search-courses"));
		searchBox.sendKeys("Python");
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(parentHandle);
		driver.findElement(By.id("name")).sendKeys("Dev Kumar");
		
	}
	@Test
	public void test2() throws InterruptedException {
		String parentHandle;
		String openTabHandle = "";
		String openWindowHandle = "";
				
		parentHandle = driver.getWindowHandle();
		
		WebElement openWindow = driver.findElement(By.id("openwindow"));
		openWindow.click();
		
		Set<String> handlesOne = driver.getWindowHandles();
		for(String handle : handlesOne){
			if(!(handle.equals(parentHandle))){
				openWindowHandle = handle;
			}
		}
		
		WebElement openTab = driver.findElement(By.id("opentab"));
		openTab.click();
		Thread.sleep(2000);
		
		Set<String> handlesTwo = driver.getWindowHandles();
		for(String handle : handlesTwo){
			if(!handlesOne.contains(handle)){
				openTabHandle = handle;
			}
		}
		System.out.println("Parent Handle: " +parentHandle);
		System.out.println("Open Tab Handle: " +openTabHandle);
		System.out.println("Open Window Handle: " +openWindowHandle);
		
		driver.switchTo().window(openWindowHandle);
		WebElement searchBox = driver.findElement(By.id("search-courses"));
		searchBox.sendKeys("Open Window");
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(openTabHandle);
		searchBox = driver.findElement(By.id("search-courses"));
		searchBox.sendKeys("Open Tab");
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(parentHandle);
		driver.findElement(By.id("name")).sendKeys("Dev Kumar");
		
	}
}