package com.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentURLTest {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		String url = driver.getCurrentUrl();

		System.out.println("Current URL: " + url);

		if (url.startsWith("https")) {
			System.out.println("Secure website");
		} else {
			System.out.println("Not secure");
		}

		driver.close();
	}
}

