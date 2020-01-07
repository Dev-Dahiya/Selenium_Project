package testpackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeDriverMac {

	public static void main(String[] args) {
		String baseURL = "www.amazon.com";

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/devkumar/Documents/workspace/chromedriver");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--test-type");
		capabilities.setCapability("chrome.binary", "/Users/devkumar/Documents/workspace/chromedriver");
		capabilities.setCapability(ChromeOptions.CAPABILITY, "MAC");
		
		driver = new ChromeDriver();
		
		
		driver.get(baseURL);
		
		
		
		
	}

}
