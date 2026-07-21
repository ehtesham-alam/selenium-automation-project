package com.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrog {

	public static void main(String[] args) {

		// Launch chrome browser
		WebDriver driver = new ChromeDriver();

		// Maximizes browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://practice.expandtesting.com/drag-and-drop");

		// find source and target web element
		WebElement source = driver.findElement(By.id("column-a"));
		WebElement target = driver.findElement(By.id("column-b"));


		Actions act = new Actions(driver);

		
		
		act.clickAndHold(source)
		   .moveToElement(target)
		   .release(target)
		   .build()
		   .perform();



	}

}