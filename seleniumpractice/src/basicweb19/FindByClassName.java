package basicweb19;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByClassName {

	public static void main(String[] args) throws InterruptedException {
		String baseURL = "https://demostore.x-cart.com/";
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0, 400);");
		
		Thread.sleep(4);
		
		driver.findElement(By.className("custom-icon")).click();
		

	}

}
