package com.qa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://jqueryui.com/tooltip/");

        // Switch to iframe
        driver.switchTo().frame(0);

        WebElement age = driver.findElement(By.id("age"));

        Actions action = new Actions(driver);
        action.moveToElement(age).perform();

        WebElement tooltip = driver.findElement(By.className("ui-tooltip-content"));

        System.out.println("Tooltip: " + tooltip.getText());

        driver.quit();
    }
}