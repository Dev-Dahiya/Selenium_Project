package testpackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondTestClass {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
	
		driver = new FirefoxDriver();
		
		String baseURL = "http://www.amazon.com";
		
		driver.get(baseURL);
		
	}

}
