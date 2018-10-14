package testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import helper.Registration;
import helperImpl.NavigationMenuImpl;
import helperImpl.RegistrationImpl;
import util.Alerthandle;
import util.Initialization;
import util.ScreenCapture;
import util.TestDataFromExcel;



public class LoginTest {
	WebDriver driver;
	@AfterClass
	public void tearDown(){
		driver.close();
	}
	@BeforeClass
	public void start(){
		driver = Initialization.start("http://automationbykrishna.com/#");
	}
	
	@AfterMethod
	public void checkStatus(ITestResult result) throws IOException{
		String fileName="Login";
		System.out.println(result.getStatus());	
		if(ITestResult.FAILURE == result.getStatus())
			//ScreenShotDemo.takeSnapshot("Test",driver);
			ScreenCapture.takesnapshot(driver, fileName);
	}
	
	@Test(dataProvider="ExcelReadData")
	public void login(String uname,String pwd) throws InterruptedException {
		WebDriver driver = Initialization.start("http://automationbykrishna.com/#");
		
		
		NavigationMenuImpl navigation = new NavigationMenuImpl(driver);
		navigation.navigationToRegistration();
	
		
		Registration reg = new RegistrationImpl(driver);
		reg.login(uname, pwd);

		String actual = Alerthandle.handleAlert(driver);
		Assert.assertEquals(actual, "Success!");
		
	}

	@DataProvider(name="ExcelReadData")
	public String[][] readExcelData() throws IOException{
		
		TestDataFromExcel testdataFromExcel = new TestDataFromExcel("E:\\Selenium Software_Maulik_Class\\Registration.xlsx","Sheet1");
		
		String[][] data = testdataFromExcel.getData();
		
		return data;
		
	}
	
	}
