package com.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
	
    public static void main(String[] args) throws InterruptedException {

  

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        Thread.sleep(3000);

        // Open Facebook
        driver.get("https://www.facebook.com/");

        Thread.sleep(3000);

        // Close browser
        driver.close();
    }
}

