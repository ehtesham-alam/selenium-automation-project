package com.qa.practice_website;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_practice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();

		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// scroll to bottom

		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(5000);
		// scroll to up
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(5000);

		// js.executeScript("window.scrollBy(0,500);");
		WebElement e = driver.findElement(By.xpath(
				"(//*[@class = 'a-cardui _quad-multi-asin-card-v2_fluid_fluidCard__3hmFA'])[1]/descendant::span[2]"));

		js.executeScript("arguments[0].scrollIntoView();", e);

		js.executeScript("alert('This is my testing alert, I have done payment process through automation');");

		Thread.sleep(5000);
		driver.switchTo().alert().accept();

		/*
		 * WebElement email = driver.findElement(By.xpath("//*[@name = 'email']"));
		 * WebElement password = driver.findElement(By.xpath("//*[@type= 'password']"));
		 * WebElement login_button =
		 * driver.findElement(By.xpath("//span[text()='Log in']"));
		 * 
		 * Thread.sleep(5000); JavascriptExecutor js = (JavascriptExecutor)driver;
		 * js.executeScript("arguments[1].style.border = '5px dashed  pink';", email);
		 * js.executeScript("arguments[0].value = 'durga@gamil.com';", email);
		 * Thread.sleep(3000);
		 * js.executeScript("arguments[0].style.border = '10px dotted blue';",
		 * password); js.executeScript("arguments[0].value = 'Durga@12345';", password);
		 * Thread.sleep(3000);
		 * js.executeScript("arguments[0].style.border = '12px double red';",
		 * login_button); js.executeScript("arguments[0].click();", login_button);
		 * 
		 * 
		 */

	}

}
