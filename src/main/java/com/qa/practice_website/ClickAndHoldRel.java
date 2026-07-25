package com.qa.practice_website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldRel {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.kirupa.com/html5/press_and_hold.htm");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.xpath("//*[@id = 'item']"));

		Actions a = new Actions(driver);
		a.clickAndHold(e).build().perform();
		Thread.sleep(5000);
		a.release(e).build().perform();

	}

}
