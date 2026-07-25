package com.qa.practice_website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Bestsellers")).click();

		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().forward();

		driver.close();

	}

}
