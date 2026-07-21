package com.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSHighlightDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// String x = driver.findElement(By.xpath("//*[text()='Facebook helps you
		// connect and share with the people in your life.']")).getText();
		WebElement s = driver.findElement(
				By.xpath("//*[text()='Facebook helps you connect and share with the people in your life.']"));
		js.executeScript("arguments[0].style.border = '5px dashed blue';", s);
		String x = s.getText();
		Thread.sleep(5000);
		System.out.println(x);
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("pass"));
		WebElement login = driver.findElement(By.xpath("login"));
		js.executeScript("arguments[0].style.border = '5px dashed pink';", email);
		js.executeScript("arguments[0].value = 'durga@gamil.com';", email);
		Thread.sleep(5000);
		js.executeScript("arguments[0].style.border = '10px dotted red';", password);
		js.executeScript("arguments[0].value = 'password1234';", password);
		Thread.sleep(5000);
		js.executeScript("arguments[0].style.border = '3px solid blue';", login);
		js.executeScript("arguments[0].click();", login);
		Thread.sleep(10000);
		driver.close();

	}

}
