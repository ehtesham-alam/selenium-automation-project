package com.qa;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {

		// Launch Chrome browser
		WebDriver driver = new ChromeDriver();

		// Navigate to Google website
		driver.navigate().to("http://www.google.com");

		// Capture page title
		@Nullable
		String title = driver.getTitle();

		// Print page title
		System.out.println("Page Title: " + title);

		// Capture current page URL
		String currentUrl = driver.getCurrentUrl();

		// Print current page URL
		System.out.println("Current URL: " + currentUrl);

		// Capture complete page source
		String pageSource = driver.getPageSource();

		// Print page source
		System.out.println(pageSource);

		// Close browser
		driver.quit();
	}
}