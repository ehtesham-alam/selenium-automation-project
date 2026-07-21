package com.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverUsingActions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Fashion']")).click();
		Thread.sleep(5000);
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[text()='Women']"))).build().perform();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Sarees")).click();
		Thread.sleep(10000);
		driver.close();
	}

}
