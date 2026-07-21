 package com.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleTest {

	public static void main(String[] args) throws InterruptedException {

		// Launch Chrome browser
		WebDriver driver = new ChromeDriver();

		// Open Amazon India website
		driver.get("https://www.amazon.in/");

		// Wait for page to load
		Thread.sleep(5000);

		// Store expected title text
		String expectedTitle = "Online Shopping site in India";

		// Capture actual page title
		String actualTitle = driver.getTitle();

		// Print actual title
		System.out.println("Actual Title: " + actualTitle);

		// Verify whether actual title contains expected title
		if (actualTitle.contains(expectedTitle)) {

			System.out.println("Title verification PASSED");

		} else {

			System.out.println("Title verification FAILED");
		}

		// Close browser
		driver.close();
	}
}