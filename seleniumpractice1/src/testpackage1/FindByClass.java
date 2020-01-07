package testpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByClass {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		String baseURL = "https://demostore.x-cart.com/";
		driver.get(baseURL);
		driver.manage().window().maximize();
		
		driver.findElement(By.className("title")).click();
	}

}
