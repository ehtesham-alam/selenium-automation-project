package com.qa;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorPractice {

	public static void main(String[] args) throws InterruptedException {

		// Launch Chrome browser
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(5000);

		// Open application URL
		driver.get("http://www.saucedemo.com");

		// Enter username using CSS Selector with ID
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");

		// Enter password using CSS Selector with name attribute
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");

		// Click Login button using CSS Selector with class name
		driver.findElement(By.cssSelector("input.submit-button")).click();

		// Get current window handle
		String currentWindowHandle = driver.getWindowHandle();

		// Switch to current browser window
		driver.switchTo().window(currentWindowHandle);

		// Click Add to Cart button for Sauce Labs Backpack
		driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();

		// Click button whose name attribute ends with 'light'
		driver.findElement(By.cssSelector("button[name$=light]")).click();

		// Close browser
		driver.close();
	}

}