package basicweb19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariDriverDemo {

	public static void main(String[] args) {
		String baseURL = "https://learn.letskodeit.com/p/practice";
		
		WebDriver driver = new SafariDriver();
		driver.get(baseURL);

	}

}
