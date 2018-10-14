package helperImpl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Registration;
import util.Elements;
import util.HighlightElement;

public class RegistrationImpl implements Registration {
	WebDriver driver;

	public RegistrationImpl(WebDriver driver) {
		this.driver = driver;
	}

	public void login(String uname, String pwd) {
		enteruserName(uname);
		enterPwd(pwd);
		clickButton();
	}

	private void enteruserName(String uname) {
		//driver.findElement(By.cssSelector("input#unameSignin")).sendKeys(uname);
		WebElement element=Elements.getElement(driver, "CSSSELECTOR", "#unameSignin");
		HighlightElement.setBorder(element, driver);
	}

	private void enterPwd(String pwd) {
		//driver.findElement(By.cssSelector("input#pwdSignin.form-control")).sendKeys(pwd);
		WebElement element=Elements.getElement(driver, "CSSSELECTOR", "input#pwdSignin.form-control");//.sendKeys(pwd);
		HighlightElement.setBorder(element, driver);
	}

	private void clickButton() {
		//driver.findElement(By.cssSelector("button#btnsubmitdetails i")).click();
		Elements.getElement(driver, "CSSSELECTOR", "button#btnsubmitdetails").click();
	}

	public void login(String uname, String pwd, String city, int pincode) {
		

	}

	public String forgotpwd(String uname) {
		
		return null;
	}

}
