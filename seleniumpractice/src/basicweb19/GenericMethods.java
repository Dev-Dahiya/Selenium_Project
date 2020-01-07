package basicweb19;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethods {
	WebDriver driver;

	public GenericMethods(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(String locatorType, String locator) {
		WebElement element = null;
		locatorType = locatorType.toLowerCase();
		try {
			if (locatorType.equals("id")) {
				element = driver.findElement(By.id(locator));
				System.out.println("Found element by: " + locatorType + " = " + locator);
			} else if (locatorType.equals("name")) {
				element = driver.findElement(By.name(locator));
				System.out.println("Found element by: " + locatorType + " = " + locator);
			} else if (locatorType.equals("classname")) {
				element = driver.findElement(By.className(locator));
				System.out.println("Found element by: " + locatorType + " = " + locator);
			} else if (locatorType.equals("xpath")) {
				element = driver.findElement(By.xpath(locator));
				System.out.println("Found element by: " + locatorType + " = " + locator);
			} else if (locatorType.equals("cssselector")) {
				element = driver.findElement(By.cssSelector(locator));
				System.out.println("Found element by: " + locatorType + " = " + locator);
			} else if (locatorType.equals("linktext")) {
				element = driver.findElement(By.linkText(locator));
				System.out.println("Found element by: " + locatorType + " = " + locator);
			} else if (locatorType.equals("partiallinktext")) {
				element = driver.findElement(By.partialLinkText(locator));
				System.out.println("Found element by: " + locatorType + " = " + locator);
			} else if (locatorType.equals("tagname")) {
				element = driver.findElement(By.tagName(locator));
				System.out.println("Found element by: " + locatorType + " = " + locator);
			} else
				System.out.println("Please enter a valid locator type.");
		} catch (Exception e) {
			System.out.println("Following error occured. " + "Please enter a valid locator.");
			System.out.println(e.getMessage());
		}
		return element;
	}
	
	public void findAndClickElement(String locatorType, String locator) {
		WebElement element = getElement(locatorType, locator);
		try {
			element.click();
			System.out.println("Clicked element having: " + locatorType + " = " + locator);
		}
		catch(Exception e){
			System.out.println("Couldn't click element by: " + locatorType + " = " + 
		locator + ". Following error occured.");
			System.out.println(e.getMessage());
		}
	}
	
	public void findAndEnterKeysInElement(String locatorType, String locator, String keyToEnter) {
		WebElement element = getElement(locatorType, locator);
		try {
			element.sendKeys(keyToEnter);
			System.out.println("Sent Keys to element having: " + locatorType + " = " + locator);
		}
		catch(Exception e){
			System.out.println("Couldn't send keys to element by: " + locatorType + " = " + 
		locator + ". Following error occured.");
			System.out.println(e.getMessage());
		}
	}

	public List<WebElement> getElementList(String locatorType, String locator) {
		List<WebElement> elementList = new ArrayList<>();
		locatorType = locatorType.toLowerCase();
		if (locatorType.equals("id")) {
			elementList = driver.findElements(By.id(locator));
		} else if (locatorType.equals("name")) {
			elementList = driver.findElements(By.name(locator));
		} else if (locatorType.equals("classname")) {
			elementList = driver.findElements(By.className(locator));
		} else if (locatorType.equals("xpath")) {
			elementList = driver.findElements(By.xpath(locator));
		} else if (locatorType.equals("cssselector")) {
			elementList = driver.findElements(By.cssSelector(locator));
		} else if (locatorType.equals("linktext")) {
			elementList = driver.findElements(By.linkText(locator));
		} else if (locatorType.equals("partiallinktext")) {
			elementList = driver.findElements(By.partialLinkText(locator));
		} else if (locatorType.equals("tagname")) {
			elementList = driver.findElements(By.tagName(locator));
		} else
			System.out.println("Please enter a valid locator type.");
		if (elementList.isEmpty()) {
			System.out.println("Element not found with, " + locatorType + " = " + locator);
		} else {
			System.out.println(
					"Found element list of size = " + elementList.size() + ", by " + locatorType + " = " + locator);
		}
		return elementList;
	}

	public boolean isElementPresent(String locatorType, String locator) {
		WebElement element = getElement(locatorType, locator);
		if (element != null) {
			System.out.println("Yes, the element is present.");
			return true;
		} else {
			System.out.println("No, the element is not present.");
			return false;
		}
	}

	public boolean isElementPresent2(String locatorType, String locator) {
		List<WebElement> elementList = getElementList(locatorType, locator);
		if (elementList.size() > 0) {
			System.out.println("Yes, the element is present.");
			return true;
		} else {
			System.out.println("No, the element is not present.");
			return false;
		}
	}

	public WebElement waitForElement(By locator, int timeout, String EC) {
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		EC = EC.toLowerCase();
		try {
			if (EC.equals("visibilityofelementlocated")) {
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			} else if (EC.equals("presenceofelementlocated")) {
				element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			} else if (EC.equals("elementtobeclickable")) {
				element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			}
		} catch (Exception e) {
			System.out.println(
					"Tried for " + timeout + " seconds, but couldn't find element" + " with locator = " + locator);
		}
		if (element != null) {
			System.out.println("Element found with timeout = " + timeout + " seconds and locator = " + locator);
		}
		return element;
	}

	public void calendarSelection(String locatorType, String locator, String date) {
		List<WebElement> validDates = getElementList(locatorType, locator);
		for (WebElement dateElement : validDates) {
			if (dateElement.getAttribute("data-day").equals(date)) {
				dateElement.click();
				System.out.println("Selected date - " + date);
				break;
			} 
		}
		
	}
	
	public void calendarSelection(String date){
		String locator = "//div[@class='datepicker-cal-month'][1]//button[@data-day='" +date+ "']";
		try{
		WebElement element = getElement("xpath", locator);
		element.click();
		System.out.println("Entered date: " + date);
		}
		catch(Exception e){
			System.out.println("Please enter a valid date.");
		}
	}

	public String getRandomString(int length){
		StringBuffer sb = new StringBuffer();
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		int range = characters.length();
		for(int i=0; i<length; i++){
			int index = (int)(Math.random()*range);
			sb.append(characters.charAt(index));
		}
		return sb.toString();
	}
	
	public static String getRandomString(){
		Date date = new Date();
		String randomString = date.toString().replaceAll(" ", "");
		return randomString;
	}
	
	public void takeScreenshot(int length){
		try {
			String fileName = getRandomString(length) + ".png";
			String directory = "//Users//devkumar//Desktop//";
			File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File destFile = new File(directory + fileName);
			FileUtils.copyFile(sourceFile, destFile);
			System.out.println("Screenshot captured at: " + directory + fileName);
		}
		catch(Exception e){
			System.out.println("Screenshot could not be captured. Following error occured");
			System.out.println(e.getMessage());
		}
	}
	
	public String takeScreenshot(String fileName) throws IOException{
		fileName = fileName + ".png";
		String directory = "//Users//devkumar//Desktop//ExtentReports//";
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String filePath = directory + fileName;
		File destFile = new File(filePath);
		FileUtils.copyFile(sourceFile, destFile);
		return filePath;
		
	}

	public List<WebElement> getAllClickableLinks(){
		List<WebElement> clickableLinks = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		elements.addAll(driver.findElements(By.tagName("img")));
		for(WebElement element : elements){
			if(element.getAttribute("href") != null){
				clickableLinks.add(element);
			}
		}
		return clickableLinks;
	}
	
	public String checkLinkStatus(URL url){
		try{
		HttpURLConnection http = (HttpURLConnection) url.openConnection();
		http.connect();
		String responseMessage = http.getResponseMessage();
		http.disconnect();
		return responseMessage;
		}
		catch(Exception e){
			return e.getMessage();
		}
	}
}