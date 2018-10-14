package com.techno;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Multitab {

	@Test
	public void Facebook() throws InterruptedException, AWTException {
		WebDriver driver = new FirefoxDriver();

		Robot rb = new Robot();

		// Automation by krishna
		driver.get("http://automationbykrishna.com");
		String aytoTitle = driver.getTitle();
		Assert.assertEquals(aytoTitle, "Login Signup Demo");

		// Facebook

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_T);

		rb.keyRelease(KeyEvent.VK_T);
		rb.keyRelease(KeyEvent.VK_CONTROL);

		driver.get("https://fb.com");
		String fbtitle = driver.getTitle();
		Assert.assertEquals(fbtitle, "Facebook – log in or sign up");

		// Gmail

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_T);

		rb.keyRelease(KeyEvent.VK_T);
		rb.keyRelease(KeyEvent.VK_CONTROL);

		driver.get("https://gmail.com");
		String gmailtitle = driver.getTitle();
		Assert.assertEquals(gmailtitle, "Gmail");

	}

}
