package com.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickUsingActions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://mousetester.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[text()='CLICK ME!']")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("reset")).click();
		Thread.sleep(10000);
		Actions a = new Actions(driver);
		WebElement e = driver.findElement(By.xpath("//*[text()='CLICK ME!']"));
		a.contextClick(e).build().perform();
		Thread.sleep(10000);
		driver.close();
	}

}
