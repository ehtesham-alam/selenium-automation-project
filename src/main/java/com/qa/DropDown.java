package com.qa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		// Launch Chrome browser
		WebDriver driver = new ChromeDriver();

		// Open application URL
		driver.get(
				"https://www.opencart.com/index.php?route=account%2Fregister");

		// Locate country dropdown element
		WebElement element = driver.findElement(By.id("input-country"));

		// Create Select class object
		Select s = new Select(element);

		// Select option by visible text
		// s.selectByVisibleText("Hong Kong");

		// Select option by value
		// s.selectByValue("80");

		// Select option by index
		// s.selectByIndex(2);

		// Check whether dropdown supports multiple selections
		if (s.isMultiple()) {

			System.out.println("Dropdown is multiple");

		} else {

			System.out.println("Dropdown is not multiple");
		}

		// Get all options from dropdown
		List<WebElement> allOptions = s.getOptions();

		// Print total number of options
		System.out.println("Total options: " + allOptions.size());

		// Iterate through all dropdown options
		for (WebElement webElement : allOptions) {

			// Print option text
			System.out.println(webElement.getText());

		}

		// Close browser
		driver.close();
	}
}