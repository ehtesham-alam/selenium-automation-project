package com.qa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_xpath_Locator {

	public static void main(String[] args) {

		// Launch Chrome browser
		ChromeDriver driver = new ChromeDriver();

		// Open SauceDemo application URL
		driver.get("http://www.saucedemo.com");

		// Enter username using ID locator
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		// Enter password using Name locator
		driver.findElement(By.name("password")).sendKeys("secret_sauce");

		// Click Login button using Class Name locator
		driver.findElement(By.className("submit-button")).click();

		// Get current window handle
		String windowHandle = driver.getWindowHandle();

		// Switch to current browser window
		driver.switchTo().window(windowHandle);

		// Locate product using Link Text locator
		// driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();

		// Locate all links containing the text "Sauce"
		List<WebElement> elementsList = driver.findElements(By.partialLinkText("Sauce"));

		// Print total matching elements
		System.out.println("Element size: " + elementsList.size());

		// Close browser
		driver.quit();
	}
}