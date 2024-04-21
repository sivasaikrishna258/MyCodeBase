package com.CRM.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.qa.BaseClass.TestBase;
import com.CRM.qa.Utilities.UtilClass;

public class SignupPage extends TestBase{
	@FindBy(css = "a[href*='register'")
	WebElement signupbutton;
	
	@FindBy(xpath = "//a[contains(text() ,'Sign Up')]")
	WebElement signuplink;
	
	@FindBy(css="input[type='checkbox']")
	WebElement termslink;
	
	@FindBy(name="email")
	WebElement username;
	
	
	public SignupPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignLink() {
		UtilClass.clickOn(driver, signupbutton, 30);
	}
	
	public void clickOnSigupLink() {
		UtilClass.clickOn(driver, signuplink, 30);
	}
	public void selectCheckbox() {
		termslink.click();
	}
	public void enterUsername() {
		username.sendKeys("siavsaikrishna");
	}
	
}
