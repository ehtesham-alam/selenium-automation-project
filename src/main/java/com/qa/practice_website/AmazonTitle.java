package com.qa.practice_website;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonTitle {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/helpcentre");
		String x = driver.getTitle();
		System.out.println(x);
		String y = "Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com";

		if (x.equals(y)) {
			System.out.println("test case passed");
		}

		else {
			System.out.println("failed");
		}
		driver.close();

	}

}
