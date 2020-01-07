package testpackage;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsDemo {
	
	public static void main(String[] args) {
		WebDriver driver;
		String baseURL = "http://www.google.com";
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("/Users/devkumar/Library/Application Support/Google/Chrome/Default/Extensions/hbcennhacfaagdopikcegfcobcadeocj/1.2_0.crx"));
		System.setProperty("webdriver.chrome.driver", "/Users/devkumar/Documents/workspace/chromedriver");
		driver = new ChromeDriver(options);
		driver.get(baseURL);
		
		

	}

}
