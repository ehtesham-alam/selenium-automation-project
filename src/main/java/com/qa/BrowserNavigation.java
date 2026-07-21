package com.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {
	
	public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Alerts.html");

        Thread.sleep(5000);

        driver.navigate().to("https://www.flipkart.com/");

        Thread.sleep(5000);

        driver.navigate().back();

        Thread.sleep(5000);

        driver.navigate().forward();

        Thread.sleep(5000);

        driver.navigate().refresh();

        driver.quit();
    }
}


