package com.qa.practice_website;

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

public class SWDRobot {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://tus.io/demo");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement chooseFile = driver.findElement(By.xpath("//*[@id = 'P0-0']"));
		Actions a = new Actions(driver);
		a.click(chooseFile).build().perform();
		Thread.sleep(5000);
		StringSelection path = new StringSelection("C:\\output_Screenshots\\testFile.txt");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(15000);
		driver.close();

	}

}
