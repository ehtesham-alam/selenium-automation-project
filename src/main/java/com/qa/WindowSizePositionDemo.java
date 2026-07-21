package com.qa;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSizePositionDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Alerts.html");

		// Current Position
		int x = driver.manage().window().getPosition().getX();
		int y = driver.manage().window().getPosition().getY();

		System.out.println("Current Position : " + x + " , " + y);

		Thread.sleep(2000);

		// Set Position
		Point p = new Point(100, 100);
		driver.manage().window().setPosition(p);

		// Current Size
		int width = driver.manage().window().getSize().getWidth();
		int height = driver.manage().window().getSize().getHeight();

		System.out.println("Current Size : " + width + " x " + height);

		Thread.sleep(2000);

		// Set Size
		Dimension d = new Dimension(500, 500);
		driver.manage().window().setSize(d);

		Thread.sleep(2000);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.quit();
	}
}