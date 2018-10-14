package helperImpl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.NavigationMenu;

public class NavigationMenuImpl implements NavigationMenu {
	WebDriver driver;

	public NavigationMenuImpl(WebDriver driver) {
		this.driver = driver;
	}

	public void navigationToRegistration() {
		driver.findElement(By.cssSelector("a#registration2")).click();
	}

	public void navigationToDemotable() {
		// TODO Auto-generated method stub

	}

	public void navigationToBasicElement() {
		// TODO Auto-generated method stub
		
	}

	

	

}
