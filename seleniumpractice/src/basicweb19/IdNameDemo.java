package basicweb19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdNameDemo {

	public static void main(String[] args) throws InterruptedException {
		String baseURL = "http://www.bing.com/";
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get(baseURL);
		
		driver.findElement(By.id("sb_form_q")).sendKeys("letskodeit");
		Thread.sleep(2000);
		driver.findElement(By.name("go")).click();

	}
	
	
}
