package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticePage {

	public static WebElement element = null;
	
	public static WebElement alertExample(WebDriver driver) {
		element = driver.findElement(By.id("name"));
		return element;	
	}
	
	// send value to alert text box
	public static void enterValuetoAlertTextBox(WebDriver driver, String alerttb) {
		element = alertExample(driver);
		element.sendKeys(alerttb);
	}
		
	public static WebElement elementDisplayedExample(WebDriver driver) {
		element = driver.findElement(By.id("displayed-text"));
		return element;
	}
	// send value to displayed text box
	public static void enderValuetoDisplayedTextBox(WebDriver driver, String displayedtb) {
		element = elementDisplayedExample(driver);
		element.sendKeys(displayedtb);
	}
	
	}


