package basicweb19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "/Users/devkumar/Documents/workspace/chromedriver");
		
		String baseURL = "https://learn.letskodeit.com/p/practice";
		
		WebDriver driver = new ChromeDriver();
		driver.get(baseURL);

	}

}
