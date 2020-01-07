package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByClassName {

	public static void main(String[] args) throws InterruptedException {
		String baseURL = "https://demostore.x-cart.com/";
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		
		driver.get(baseURL);
		
		driver.findElement(By.className("title")).click();
		
		
		

	}

}
