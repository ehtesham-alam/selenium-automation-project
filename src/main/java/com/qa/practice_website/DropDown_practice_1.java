package com.qa.practice_website;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown_practice_1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		WebElement e = driver.findElement(By.xpath("//b[text()='Multiselect drop down']/following::div[5]"));
		Actions a = new Actions(driver);
		a.click(e).build().perform();
		Thread.sleep(5000);
		a.sendKeys("Green").build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		a.sendKeys("Red").build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.ENTER).build().perform();

	}

}
