package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Initialization {

	static public WebDriver start(String url) {

		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
	}

	static public WebDriver start() {

		WebDriver driver = start("http://automationbykrishna.com/#");
		return driver;
	}
}
