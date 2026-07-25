package com.qa.practice_website;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='orangehrm-login-footer-sm']/a[1]")).click();
		driver.findElement(By.xpath("//*[@class='orangehrm-login-footer-sm']/a[2]")).click();
		driver.findElement(By.xpath("//*[@class='orangehrm-login-footer-sm']/a[3]")).click();
		driver.findElement(By.xpath("//*[@class='orangehrm-login-footer-sm']/a[4]")).click();

		List<WebElement> a = driver.findElements(By.tagName("a"));

		Set<String> links = driver.getWindowHandles();
		Iterator<String> i = links.iterator();
		String parent = driver.getWindowHandle();

		while (i.hasNext()) {

			String child = i.next();
			driver.switchTo().window(child);
			if (driver.getCurrentUrl().equals("https://x.com/orangehrm?lang=en")) {
				Thread.sleep(12000);
				driver.close();
			}

		}
		driver.switchTo().window(parent);

	}

}
