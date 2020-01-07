package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdXPathDemo {

	public static void main(String[] args) {
		String baseURL = "http://www.google.com";
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "/Users/devkumar/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		driver.get(baseURL);
		
		driver.findElement(By.id("gs_htif0")).sendKeys("letskodeit");
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
		

	}

}
