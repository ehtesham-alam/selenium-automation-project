package com.qa;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.id("cars"));
		Select s = new Select(e);
		Actions a = new Actions (driver);
		//s.selectByIndex("Volvo");
		a.keyDown(Keys.CONTROL).click(s.getOptions().get(0)).click(s.getOptions().get(2)).build().perform();
		a.keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		s.deselectAll();
		Thread.sleep(5000);
		driver.close();


		}


}
