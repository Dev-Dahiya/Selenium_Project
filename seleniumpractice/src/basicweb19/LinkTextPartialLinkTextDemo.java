package basicweb19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextPartialLinkTextDemo {

	public static void main(String[] args) throws InterruptedException {
		String baseURL = "https://letskodeit.teachable.com/";
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		driver.findElement(By.partialLinkText("Prac")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Login")).click();
		
	}

}
