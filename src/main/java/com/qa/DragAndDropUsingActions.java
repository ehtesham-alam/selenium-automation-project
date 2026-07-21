
package com.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropUsingActions {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(4000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe")));
		WebElement source = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]"));
		WebElement destination = driver.findElement(By.xpath("//*[@id=\"trash\"]"));
		Actions a = new Actions(driver);
		a.dragAndDrop(source, destination).build().perform();
		Thread.sleep(4000);
	}

}
