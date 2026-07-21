package com.qa;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// 08-July-2022;

		String expectedDay = "8";
		String expectedMonthYear = "July 2029";

		// launch chrome browser
		
		WebDriver driver = new ChromeDriver();

		// maximise browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://www.redbus.in/");

		// find date picker webelement to perform click action

		WebElement datepicker = driver.findElement(By.id("onward_cal"));
		datepicker.click();

		while (true) {
			String calenderMonthYear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();

			if (calenderMonthYear.equals(expectedMonthYear)) {
				driver.findElement(By.xpath("//td[text()='" + expectedDay + "']")).click();

				break;
			} else {
				driver.findElement(By.xpath("//td[@class='next']")).click();
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}