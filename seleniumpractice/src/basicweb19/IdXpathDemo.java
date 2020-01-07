package basicweb19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdXpathDemo {

	public static void main(String[] args) {
		String baseURL = "http://www.yahoo.com";
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		driver.findElement(By.id("uh-search-box")).sendKeys("letskodeit");
		driver.findElement(By.xpath("//button[@id='uh-search-button']")).click();

	}

}
