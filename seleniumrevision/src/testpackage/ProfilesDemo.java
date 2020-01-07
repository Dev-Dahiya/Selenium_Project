package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class ProfilesDemo {

	public static void main(String[] args) {
		WebDriver driver;
		String baseURL = "https://letskodeit.teachable.com/";
		
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile fxProfile = profile.getProfile("seleniumprofile");
		
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver(fxProfile);
		driver.manage().window().maximize();
		driver.get(baseURL);

	}

}
