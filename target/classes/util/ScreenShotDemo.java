package util;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ScreenShotDemo {
	WebDriver driver;		
		//String actualtitle= driver.getTitle();
		
		//Assert.assertTrue(actualtitle.contains("Face"));
		//takeSnapshot(driver,"Result");	
	
	@AfterMethod
	public void checkStatus(ITestResult result) throws IOException{
		System.out.println(result.getStatus());
		if(ITestResult.FAILURE == result.getStatus())
			takeSnapshot("FacebookLogin", driver);
	}
	
	
	static public void takeSnapshot(String fileName,WebDriver driver) throws IOException{
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		//File dest = new File(".//screenshot//"+fileName+".png");
		FileUtils.copyFile(srcFile, new File(".//screenshot//"+fileName+".png"));
		
	}
}

