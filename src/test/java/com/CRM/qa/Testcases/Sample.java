package com.CRM.qa.Testcases;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {
	
	
	@Test
	public void cheomeTest() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com");
		System.out.println("1stclass 1st method : "+Thread.currentThread().getId());
		driver.quit();	}
	
	//@Test
	public void edge() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com");
		System.out.println("1stclass 2nd method : "+Thread.currentThread().getId());
		driver.quit();
	}

}
