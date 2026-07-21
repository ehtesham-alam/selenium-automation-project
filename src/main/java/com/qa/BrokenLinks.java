package com.qa;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {

		// Launch Chrome browser
		WebDriver driver = new ChromeDriver();

		// Maximize browser window
		driver.manage().window().maximize();

		// Wait up to 10 seconds for elements to be found
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open application URL
		driver.get("http://www.deadlinkcity.com/");

		// Find all hyperlinks available on the page
		List<WebElement> list = driver.findElements(By.tagName("a"));

		// 2XX response codes indicate successful requests
		int resCode = 200;

		// Store count of broken links
		int brokenLinkCnt = 0;

		// Print total number of links found on the page
		System.out.println("Total links on page: " + list.size());

		// Iterate through each hyperlink
		for (WebElement webElement : list) {

			// Get href attribute value
			String url = webElement.getAttribute("href");

			// Skip links with null or empty href
			if (url == null || url.isEmpty()) {
				continue;
			}

			try {

				// Create URL object
				URL urlLinks = new URL(url);

				// Open connection with the URL
				HttpURLConnection openConnection = (HttpURLConnection) urlLinks.openConnection();

				// Send HEAD request
				openConnection.setRequestMethod("HEAD");

				// Establish connection
				openConnection.connect();

				// Get HTTP response code
				resCode = openConnection.getResponseCode();

				// Check whether the link is broken
				if (resCode >= 400) {

					System.out.println(url + " ---> Broken Link");

					// Increment broken link counter
					brokenLinkCnt++;

				}

			}

			// Handle invalid URL format exception
			catch (MalformedURLException e) {

			}

			// Handle all other exceptions
			catch (Exception e) {

			}

		}

		// Print total number of broken links
		System.out.println("Total broken links : " + brokenLinkCnt);
		driver.quit();

	}

}