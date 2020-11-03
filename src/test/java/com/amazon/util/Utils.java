package com.amazon.util;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class Utils {
	
	/**
	 * @author Manjunath
	 * @param driver
	 * @param element
	 * @param value
	 */
	public static void typeText(AppiumDriver<WebElement> driver, String element, String value) {
		System.out.println("Type the value in text field: ");
		WebElement txtElement = returnWebElemt(driver, element);
		txtElement.clear();
		txtElement.sendKeys(value);
	}
	
	/**
	 * @author Manjunath
	 * @param driver
	 * @param element
	 * @param value
	 */
	
	public static void clickOnElement(AppiumDriver<WebElement> driver, String element) {
		WebElement clkElement = returnWebElemt(driver, element);
		clkElement.click();
		
	}

	
	/**
	 * @author Manjunath
	 * @param driver
	 * @param element
	 * @param value
	 */
	public static WebElement returnWebElemt(AppiumDriver<WebElement> driver, String element) {
		// TODO Auto-generated method stub
		if(element.startsWith("/"))
		{
			return driver.findElementByXPath(element);
		}else {
			return driver.findElementById(element);
		}
		
	}
}
