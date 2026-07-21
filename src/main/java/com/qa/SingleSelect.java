package com.qa;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(5000);
		WebElement e = driver.findElement(By.id("oldSelectMenu"));
		Select s = new Select(e);
		if (s.isMultiple()) {
			System.out.println("Multi Select Dropdown");
		} else {
			System.out.println("Single Select Dropdown");
		}

		List<WebElement> l = s.getOptions();
		System.out.println(l.size());
		s.selectByVisibleText("Black");
		Thread.sleep(5000);
		s.selectByValue("8");
		Thread.sleep(5000);
		s.selectByIndex(10);
		Thread.sleep(5000);

		// count of dropdown values

		driver.close();
	}

}
