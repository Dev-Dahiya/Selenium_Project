package UsefulMethods;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericMethodNew {
	WebDriver driver;
	
	public GenericMethodNew(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getElement(String locator, String type) {
		type = type.toLowerCase();
		
		if (type.equals("id")) {
			System.out.println("Element found with id: " +locator);
			return this.driver.findElement(By.id(locator));
		}
		
		else if (type.equals("xpath")) {
			
			return this.driver.findElement(By.xpath(locator));
		}
		
		else {
			return null;
		}
	}

	public List<WebElement> getElementList(String locator, String type) {
		type = type.toLowerCase();
		List<WebElement> elementList = new ArrayList<WebElement>();
		
		if(type.equals("xpath")) {
			elementList = this.driver.findElements(By.xpath(locator));
		}
		else if (type.equals("id")) {
			elementList = this.driver.findElements(By.id("id"));
		}
		else {
			System.out.println("Locator type not supported");
		}
		if (elementList.isEmpty()) {
			System.out.println("Element not found with: " + type + ":" + locator);
		}
		else {
			System.out.println("Element found with " + type + ":" + locator);
		}
		
		
		return elementList;
		
	}

	public Boolean isElementPresent (String locator, String type) {
		List<WebElement> elementPresent = getElementList(locator, type);
		int size = elementPresent.size();
		System.out.println("size is " + size);
		
		if (size > 0) {
			return true;
		}
		else {
			return false;
		}
	}


}
