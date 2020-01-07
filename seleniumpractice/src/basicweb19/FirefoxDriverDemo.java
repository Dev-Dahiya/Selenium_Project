package basicweb19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo {

	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		String baseURL = "https://learn.letskodeit.com/p/practice";
		
		driver.get(baseURL);

	}

}
