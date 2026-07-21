package com.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_demo {

	public static void main(String[] args) throws InterruptedException {

		// Launch Chrome browser
		ChromeDriver driver = new ChromeDriver();
		

		// Open application URL
		driver.get("http://www.saucedemo.com");

		// Locate username using XPath contains() function
		driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("standard_user");

		// Locate password using multiple attributes
		driver.findElement(By.xpath("//*[@id='password'][@name='password']")).sendKeys("secret_sauce");

		// Click Login button using XPath
		driver.findElement(By.xpath("//input[@id='login-button']")).click();

		// Get current window handle
		String currentWindowHandle = driver.getWindowHandle();

		// Switch to current browser window
		driver.switchTo().window(currentWindowHandle);

		// Click Add to Cart button using AND operator
		driver.findElement(
				By.xpath("//button[@id='add-to-cart-sauce-labs-backpack' and @name='add-to-cart-sauce-labs-backpack']"))
				.click();

		// Click Add to Cart button using OR operator
		driver.findElement(By.xpath(
				"//button[@id='add-to-cart-sauce-labs-bike-light' or @name='add-to-cart-sauce-labs-bike-light']"))
				.click();

		// Close browser
		//driver.close();

	}
}