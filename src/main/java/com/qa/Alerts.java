package com.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximise browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// find alert button and perform click action

		// driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

		// driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

		// find alert button and perform click action
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

		 //switch to alert window, enter name
		  driver.switchTo().alert().sendKeys("Sudha");
		 
		 //accept alert 
		  driver.switchTo().alert().accept();//to ok alert
		  
		  
		 
			// find alert button and perform click action


	}

}