package com.qa.practice_website;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Practice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		/*
		 * WebElement e = driver.findElement(By.id("oldSelectMenu")); Select s = new
		 * Select(e); List<WebElement> l = s.getOptions(); System.out.println(l.size());
		 * 
		 * for(int i = 0;i<l.size();i++) { String x = l.get(i).getText();
		 * System.out.println(x);
		 * 
		 * s.selectByIndex(i); Thread.sleep(3000); }
		 * 
		 * if(s.isMultiple()) { System.out.println("multi selection dropdown"); } else {
		 * System.out.println("single selection dropdown"); }
		 * 
		 * s.selectByIndex(9); Thread.sleep(5000); s.selectByVisibleText("Black");
		 * Thread.sleep(5000); s.selectByValue("2");
		 */
		WebElement multi = driver.findElement(By.id("cars"));
		Select s1 = new Select(multi);
		Actions a = new Actions(driver);
		a.keyDown(Keys.CONTROL).click(s1.getOptions().get(0)).click(s1.getOptions().get(2))
				.click(s1.getOptions().get(3)).build().perform();
		a.keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		s1.deselectByValue("opel");

	}

}
