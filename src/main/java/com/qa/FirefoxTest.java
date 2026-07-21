package com.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();


		driver.get("https://www.flipkart.com/");

		Thread.sleep(3000);

		driver.close();
	}
}
