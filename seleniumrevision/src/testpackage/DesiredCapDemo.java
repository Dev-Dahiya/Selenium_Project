package testpackage;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapDemo {

	public static void main(String[] args) {
		WebDriver driver;
		String baseURL = "http://www.letskodeit.com";
		
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		DesiredCapabilities caps = DesiredCapabilities.firefox();
		caps.setBrowserName("firefox");
		caps.setPlatform(Platform.MAC);
		
		driver = new FirefoxDriver(caps);
		driver.manage().window().maximize();
		driver.get(baseURL);
		

	}

}
