package testpackage;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProfilesDemo2 {

	public static void main(String[] args) {
		WebDriver driver;
		String baseURL = "https://letskodeit.teachable.com/";
		
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/devkumar/Documents/workspace/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File ("/Users/devkumar/Library/Application Support/Google/Chrome/Default/Extensions/aiimdkdngfcipjohbjenkahhlhccpdbc/29.1.0_0.crx"));
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(baseURL);

	}

}
