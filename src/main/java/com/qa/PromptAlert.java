package com.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//*[text()='Alert with OK & Cancel ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='click the button to display a confirm box ']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		String x = driver.findElement(By.xpath("//*[text()='You pressed Ok']")).getText();
		System.out.println(x);
	}

}
