package com.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookTooltip {

	public static void main(String[] args) {
		
		// Launch chrome browser
		WebDriver driver = new ChromeDriver();

		// maximise browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://www.facebook.com/");

		// find sign up web element
		String actualToolTip = driver.findElement(By.xpath("//a[@href='/reg/']")).getAttribute("title");

		System.out.println("Actual Tooltip: " + actualToolTip);

		

	}

}