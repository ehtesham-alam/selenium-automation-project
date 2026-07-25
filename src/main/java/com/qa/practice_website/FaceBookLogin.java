package com.qa.practice_website;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBookLogin {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www/amazon.com//");
		String x = driver.getTitle();
		System.out.println(x);
		String y = ("online shopping india");
		if (x.equals(y)) {
			System.out.println("test case passed");

		} else {
			System.out.println("failed");
		}

	}

}
