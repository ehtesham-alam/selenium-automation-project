package com.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	

	    public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new EdgeDriver();

	        driver.manage().window().maximize();
	        driver.get("https://www.amazon.in");

	        Thread.sleep(3000);

	        WebElement account = driver.findElement(By.id("nav-link-accountList"));

	        Actions actions = new Actions(driver);
	        actions.moveToElement(account).perform();

	        Thread.sleep(5000);

	        driver.quit();
	    }
	}

