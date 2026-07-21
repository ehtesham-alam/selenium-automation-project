package com.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//*[text()='Alert with Textbox ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='click the button to demonstrate the prompt box ']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().sendKeys("Durga");
		Thread.sleep(5000);
		driver.close();

	}
}