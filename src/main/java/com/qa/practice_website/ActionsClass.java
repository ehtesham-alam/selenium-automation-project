package com.qa.practice_website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo2.php");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement e = driver.findElement(By.cssSelector("#box"));
		Actions a = new Actions(driver);
		a.doubleClick(e).build().perform();
		Thread.sleep(2000);
		String x = e.getText();
		System.out.println(x);
		Thread.sleep(2000);
		a.click(e).build().perform();
		String y = e.getText();
		System.out.println(y);
		a.contextClick(e).build().perform();

	}

}
