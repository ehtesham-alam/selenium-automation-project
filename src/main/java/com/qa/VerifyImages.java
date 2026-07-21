package com.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyImages {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		String x = driver.getCurrentUrl();

		System.out.println(x);

		if (x.contains("https")) {
			System.out.println("Secured website");
		} else {
			System.out.println("unsecured site");
		}
		driver.close();

	}

}
