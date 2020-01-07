package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeTest {

	public static void main(String[] args) {
		String baseURL = "http://www.google.com";
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "/Users/devkumar/Documents/workspace/chromedriver");
		driver = new ChromeDriver();
		driver.get(baseURL);

	}

}
