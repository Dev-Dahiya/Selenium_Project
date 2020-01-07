package testpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindbyTagname {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		
		String baseURL = "https://demostore.x-cart.com/";
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		driver.findElement(By.tagName("a")).click();
		

	}

}
