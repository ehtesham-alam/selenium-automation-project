package com.qa;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTabOrWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Launch chrome browser
		
		WebDriver driver = new ChromeDriver();

		// Maximize browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://www.google.com/");
		System.out.println("first page : " + driver.getTitle());

		// open new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		System.out.println("second tab : " + driver.getTitle());

		// get window handles of open windows
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>();
		handles.addAll(windowHandles);

		driver.close();
		driver.switchTo().window(handles.get(0));// switch to google.com
		System.out.println("first page : " + driver.getTitle());

	}

}