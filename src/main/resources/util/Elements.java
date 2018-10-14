package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elements {
	static public WebElement getElement(WebDriver driver, String locator, String value) {
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(driver, 15);

		if (locator.contains("CSSSELECTOR"))
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(value)));
		else if (locator.contains("XPATH"))
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(value)));
		else if (locator.contains("ID"))
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(value)));
		return element;
	}

}
