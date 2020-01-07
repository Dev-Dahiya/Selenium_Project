package testpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByLinkText {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		String baseURL = "http://newtours.demoaut.com/";
		driver.get(baseURL);
		
		driver.findElement(By.partialLinkText("Rentals")).click();
		
		
		
		
	}

}
