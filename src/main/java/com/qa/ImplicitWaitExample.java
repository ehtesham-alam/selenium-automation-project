package com.qa;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

public class ImplicitWaitExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.in");

		Stopwatch watch = Stopwatch.createStarted();

		try {

			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Laptop");

			driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

			watch.stop();

			System.out.println("Search Successful");
			System.out.println("Time Taken : " + watch.elapsed(TimeUnit.SECONDS) + " Seconds");

		} catch (Exception e) {

			watch.stop();

			System.out.println("Exception : " + e.getMessage());
			System.out.println("Time Taken : " + watch.elapsed(TimeUnit.SECONDS) + " Seconds");
		}

		driver.quit();
	}
}