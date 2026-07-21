package com.qa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_web {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();

		Thread.sleep(5000);
		List<WebElement> e = driver.findElements(By.tagName("a"));
		int size = e.size();
		System.out.println(size);

		for (int i = 0; i < size; i++) {

			String x = e.get(i).getText();

			if (!x.isEmpty()) {
				System.out.println(x);
			}

		}
		driver.close();

	}

}
