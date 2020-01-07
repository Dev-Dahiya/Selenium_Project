package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdName {

	public static void main(String[] args) {
		String baseURL = "http://google.com";
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		
		driver.get(baseURL);
		driver.findElement(By.name("q")).sendKeys("letskodeit");
		driver.findElement(By.name("btnK")).click();

	}

}
