package testpackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class idXPathDemo {

	public static void main(String[] args) {
WebDriver driver;
System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
driver = new FirefoxDriver();

String baseURL = "http://www.google.com";
driver.manage().window().maximize();
driver.get(baseURL);

driver.findElement(By.id("gs_htif0")).sendKeys("letskodeit");

driver.findElement(By.xpath("#_fZl")).click();
	}

}
