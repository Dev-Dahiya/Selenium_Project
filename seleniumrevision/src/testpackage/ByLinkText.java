package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByLinkText {

	public static void main(String[] args) throws InterruptedException {
		String baseURL = "https://demostore.x-cart.com/";
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		
		driver.get(baseURL);
		driver.findElement(By.linkText("Shipping")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Contact")).click();
		
		
		

	}

}
