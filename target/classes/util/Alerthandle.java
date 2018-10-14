package util;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Alerthandle {
	
	static public String handleAlert(WebDriver driver){
		Alert alt=driver.switchTo().alert();
		String Actual=alt.getText();
		alt.accept();
		return Actual;
		
	}

}
