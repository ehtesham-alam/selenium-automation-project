package com.qa.practice_website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURL {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		/*
		 * driver.get("https://demo.automationtesting.in/Alerts.html");
		 * //https://demoqa.com/alerts driver.manage().window().maximize();
		 * Thread.sleep(3000); driver.findElement(By.id("OKTab")).click();
		 * Thread.sleep(4000); driver.switchTo().alert().accept();
		 * driver.findElement(By.xpath("//*[text()='Alert with OK & Cancel ']")).click()
		 * ; Thread.sleep(4000); driver.findElement(By.id("CancelTab")).click();
		 * Thread.sleep(4000); driver.switchTo().alert().dismiss(); Thread.sleep(4000);
		 * String x = driver.findElement(By.id("demo")).getText();
		 * System.out.println(x);
		 * 
		 * driver.findElement(By.linkText("Alert with Textbox")).click();
		 * driver.findElement(By.id("Textbox")).click(); Thread.sleep(2000);
		 * driver.switchTo().alert().sendKeys("DurgaQATesting purpose");
		 * Thread.sleep(2000); driver.switchTo().alert().accept();
		 */
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Durga");
		driver.switchTo().alert().accept();
	}

}
