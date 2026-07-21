package com.qa;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import com.google.common.base.Stopwatch;

public class FluentWaitExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/dynamic-properties");

		Stopwatch watch = Stopwatch.createStarted();

		FluentWait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(Exception.class);

		WebElement button = wait.until(driver1 -> driver1.findElement(By.xpath("//button[@id='visibleAfter']")));

		watch.stop();

		System.out.println("Button Text : " + button.getText());
		System.out.println("Time Taken : " + watch.elapsed(TimeUnit.SECONDS) + " Seconds");

		button.click();

		driver.quit();
	}
}