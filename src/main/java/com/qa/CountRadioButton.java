package com.qa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRadioButton {

	public static void main(String[] args) {

		// Launch Chrome Browser
		WebDriver driver = new ChromeDriver();

		// Maximize Browser Window
		driver.manage().window().maximize();

		// Open Website
		driver.get("https://www.calculator.net/");

		// Find All Radio Buttons Present On The Web Page
		List<WebElement> elements = driver.findElements(By.xpath("//input[@type='radio']"));

		// Print Total Number Of Radio Buttons
		System.out.println("Total Number Of Radio Buttons On Web Page: " + elements.size());

		// Close Browser
		driver.quit();
	}
}