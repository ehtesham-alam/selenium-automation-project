package com.qa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHyperlinks {

	public static void main(String[] args) {

		// Launch Chrome browser
		WebDriver driver = new ChromeDriver();

		// Maximize browser window
		driver.manage().window().maximize();

		// Open application URL
		driver.get("https://www.calculator.net/");

		// Find all hyperlinks available on the page
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));

		// Print total number of hyperlinks
		System.out.println("Total links on page: " + linkElements.size());

		// Iterate through each hyperlink
		for (WebElement webElement : linkElements) {

			// Print visible text of each hyperlink
			System.out.println(webElement.getText());

		}

		// Close browser
		driver.close();
	}

}