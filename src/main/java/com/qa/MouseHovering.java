package com.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) throws InterruptedException {
		
				WebDriver driver = new ChromeDriver();
				driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");
				driver.manage().window().maximize(); 
				Thread.sleep(5000);
				/*
				 * driver.manage().window().maximize(); Thread.sleep(2000); WebElement login =
				 * driver.findElement(By.xpath("//*[@title = 'Login']")); Actions a = new
				 * Actions(driver); a.moveToElement(login).build().perform();
				 * Thread.sleep(3000);
				 * driver.findElement(By.xpath("//*[@title = 'Sign Up']")).click();
				 * Thread.sleep(3000);
				 */
				driver.switchTo().frame(driver.findElement(By.xpath("(//*[@class='demo-frame'])[1]")));
				
				WebElement e1 = driver.findElement(By.xpath("//*[text()='High Tatras 2']"));
				WebElement e2 = driver.findElement(By.id("trash"));
				Actions a = new Actions(driver);
				a.dragAndDrop(e1, e2).build().perform();
	}

}
