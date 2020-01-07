package basicweb19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByTagName {

	public static void main(String[] args) {
		String baseURL = "https://learn.letskodeit.com/p/practice";
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		driver.findElement(By.tagName("a")).click();
	}

}
