package com.qa.practice_website;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyImages {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://m.dominos.co.in/jfl-discovery-ui/en/web/home-guest/6585R");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Skip']")).click();
		Thread.sleep(5000);
		List<WebElement> craving = driver.findElements(By.xpath("//*[text()='Crazy Deals']/ancestor::ol/child::li"));
		System.out.println(craving.size());

	}

}
