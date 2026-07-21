package com.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSScrollDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scroll down
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(7000);
		// scroll up
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(7000);
		// scroll to specific element
		WebElement e = driver.findElement(By.linkText("Watches"));
		js.executeScript("arguments[0].scrollIntoView();", e);

	}

}
