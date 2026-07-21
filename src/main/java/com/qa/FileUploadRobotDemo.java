package com.qa;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadRobotDemo {

	public static void main(String[] args) throws InterruptedException, AWTException {

		// Launch Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Open Website
		driver.get("https://testautomationpractice.blogspot.com/");

		Thread.sleep(3000);

		// Click Upload Button
		driver.findElement(By.id("singleFileInput")).sendKeys("C:\\Users\\LENOVO\\Desktop\\ealam_resume.pdf");

		Thread.sleep(3000);

		// File Path Copy
		

		// Robot Object
		Robot robot = new Robot();

		// CTRL + V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(2000);

		// ENTER
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);

		driver.quit();
	}
}