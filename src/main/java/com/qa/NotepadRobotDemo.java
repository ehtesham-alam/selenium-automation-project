package com.qa;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class NotepadRobotDemo {

	public static void main(String[] args) throws Exception {

		// Open Notepad
		Runtime.getRuntime().exec("notepad.exe");

		Thread.sleep(3000);

		Robot robot = new Robot();

		// Copy Text
		StringSelection text = new StringSelection("This is Robot Class Automation Example.");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(text, null);

		// CTRL + V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(2000);

		// CTRL + S
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);

		robot.keyRelease(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(2000);

		// File Path
		StringSelection path = new StringSelection("C:\\Users\\LENOVO\\Desktop\\RobotDemo.txt");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);

		// CTRL + V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(2000);

		// ENTER
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		// ALT + F4
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_F4);

		robot.keyRelease(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_ALT);

	}
}