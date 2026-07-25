package com.qa.practice_website;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Syncronise_selenium {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://practice.expandtesting.com/dynamic-loading/1");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@title = 'Programming']")).click();
		// specifically waiting locator

		/*
		 * WebDriverWait w = new WebDriverWait(driver,30);
		 * w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		 */

		// dynamic element
		FluentWait<WebDriver> wa = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(500,
				TimeUnit.MILLISECONDS);
		wa.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[text()='Get Trial Today']")));

		driver.findElement(By.xpath("//*[text()='Get Trial Today']")).click();

	}

}
