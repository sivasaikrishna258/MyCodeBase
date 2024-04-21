package com.CRM.qa.Testcases;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample1 {

	
	@Test
	public void cheomeTest1() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com");
		System.out.println("2nd class 1st method : "+Thread.currentThread().getId());
		driver.quit();
	}
	
	//@Test
	public void edge1() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com");
		System.out.println("2nd class 2nd method : "+Thread.currentThread().getId());
		driver.quit();
	}
}
