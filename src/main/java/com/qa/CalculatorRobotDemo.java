package com.qa;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CalculatorRobotDemo {

	public static void main(String[] args) throws Exception {

		// Open Calculator
		Runtime.getRuntime().exec("calc.exe");

		Thread.sleep(3000);

		// Copy 89 to Clipboard
		StringSelection num1 = new StringSelection("89");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(num1, null);

		Robot robot = new Robot();

		// CTRL + V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(2000);

		// Press +
		robot.keyPress(KeyEvent.VK_ADD);
		robot.keyRelease(KeyEvent.VK_ADD);

		Thread.sleep(2000);

		// Copy 67
		StringSelection num2 = new StringSelection("67");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(num2, null);

		// CTRL + V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(2000);

		// Press =
		robot.keyPress(KeyEvent.VK_EQUALS);
		robot.keyRelease(KeyEvent.VK_EQUALS);

		Thread.sleep(5000);

		// ALT + F4
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_F4);

		robot.keyRelease(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_ALT);

	}
}