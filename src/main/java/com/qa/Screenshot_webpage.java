package com.qa;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_webpage {

	public static void main(String[] args) throws IOException {

//		 Launch Chrome browser
		WebDriver driver = new ChromeDriver();

//		 Open Amazon website
		driver.get("https://www.amazon.in/");
 
//		 Maximize browser window
		driver.manage().window().maximize();

		/*
		 * // Capture full screenshot of current webpage File srcFile =
		 * ((TakesScreenshot) driver) .getScreenshotAs(OutputType.FILE);
		 * 
		 * // Specify destination path File destFile = new File(
		 * "D:\\eclipse-workspace\\SeleniumFramework\\Screenshots\\AmazonHomePage.png");
		 * 
		 * // Copy screenshot to destination location Files.copy(srcFile, destFile);
		 * 
		 * 
		 */

//		Capture section of webpage
		
		//step1: convert webdriver object to TakesScreenshot interface
		//TakesScreenshot screenshot = ((TakesScreenshot)driver);
		WebElement section = driver.findElement(By.xpath("//a[@aria-label='Amazon.in']"));
		
		//step2: call getScreenshotAs method to create image file
		File src = section.getScreenshotAs(OutputType.FILE);

		File dest = new File("D:\\eclipse-workspace\\SeleniumFramework\\Screenshots\\section.png");


		//step3: copy image file to destination
		FileUtils.copyFile(src, dest);

		System.out.println("Screenshot captured successfully.");

//		 Close browser
		driver.quit();
	}
}