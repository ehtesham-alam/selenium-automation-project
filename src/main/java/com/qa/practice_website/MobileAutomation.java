package com.qa.practice_website;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;
public class MobileAutomation {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities c = new DesiredCapabilities();
		//device specification
		c.setCapability("deviceName", "10BE2L2B9K001FM");
		c.setCapability("platformName", "Android");
		c.setCapability("platformVersion", "15.0");
		//app related info - apk info
		c.setCapability("appPackage", "com.vivo.calculator");
		c.setCapability("appActivity", "com.vivo.calculator.Calculator");
		
		//local host url
		
		URL u = new URL("http://127.0.0.1:4723/wd/hub");
		WebDriver driver = null;
		
		AndroidDriver a = new AndroidDriver(u,c);
		TouchActions t  = new TouchActions(driver);
		
		 	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@content-desc = '8']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@content-desc = '2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Multiply\"]"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@content-desc = '9']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@content-desc = '8']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@content-desc = '=']")).click();
		Thread.sleep(3000);
		
		String x = driver.findElement(By.xpath("//*[@resource-id = 'com.vivo.calculator:id/formula']")).getText();		
		
		System.out.println(x);
		

	}

}
