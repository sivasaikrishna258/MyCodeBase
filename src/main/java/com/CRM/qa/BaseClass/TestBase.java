package com.CRM.qa.BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.CRM.qa.Utilities.WebDriverEventListner;

public class TestBase  {

	public static WebDriver driver;
	public static Properties property;
	public  static EventFiringWebDriver e_driver;
	public static WebDriverEventListner eventListener;


	 public TestBase() {

		try {
			FileInputStream file = new FileInputStream("./Config/config.properties");
			property=new Properties();//create instance of properties class
			property.load(file);
		} 
//		catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	 @BeforeMethod
	 public static void initialization() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebDriverEventListner();
		e_driver.register(eventListener);
		driver = e_driver;
		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(property.getProperty("AppURL"));

	}
	 
	 //@AfterMethod()
	 public void teardown() {
		 
		 driver.quit();
	 }

}
