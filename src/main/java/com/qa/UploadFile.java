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
import org.openqa.selenium.interactions.Actions;

public class UploadFile {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		// Launch chrome browser
		
		WebDriver driver = new ChromeDriver();

		// maximise browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://demoqa.com/upload-download");

		// find webelement choose file
		 //driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\\\Users\\\\LENOVO\\\\Desktop\\\\cbx.txt");

			
			  WebElement button =
			  driver.findElement(By.xpath("//input[@id='uploadFile']"));
			  
			  Actions act = new Actions(driver);
			  act.moveToElement(button).click().perform();
			  
			  Robot rb = new Robot(); rb.delay(2000);
			  
			  // copy file to clip board StringSelection ss = new
			  StringSelection ss = new StringSelection("C:\\Users\\LENOVO\\Desktop\\cbx.txt");
			  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			  
			  // perform control + V action to paste file rb.keyPress(KeyEvent.VK_CONTROL);
			  rb.keyPress(KeyEvent.VK_V);
			  
			  rb.keyRelease(KeyEvent.VK_CONTROL); rb.keyRelease(KeyEvent.VK_V);
			  
			  rb.keyPress(KeyEvent.VK_ENTER); rb.keyRelease(KeyEvent.VK_ENTER);
			 
	}

}