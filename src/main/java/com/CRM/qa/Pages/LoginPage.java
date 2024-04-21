package com.CRM.qa.Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.CRM.qa.BaseClass.TestBase;
import com.CRM.qa.Utilities.UtilClass;

public class LoginPage extends TestBase {
	 
	@FindBy(css = "a[href*='ui'")
	private WebElement loginbutton;

//	/**
//	 * @return the loginbutton
//	 */
//	public WebElement getLoginbutton() {
//		return loginbutton;
//	}
//
//	/**
//	 * @param loginbutton the loginbutton to set
//	 */
	public void setLoginbutton(WebElement loginbutton) {
		this.loginbutton = loginbutton;
	}

	@FindBy(name = "email")
	WebElement username;

	@FindBy(name = "password")
	 WebElement password;

	@FindBy(xpath = "//div[contains(@class,'ui fluid large blue submit button')]")
	WebElement login;

	@FindBy(xpath = "//div[contains(@class,'signup button')]")
	WebElement Signup;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
//	public void clickOnLoginLink() {
//		loginbutton.click();
//	}

	public HomePage login(String uname,String Pwd) {
		loginbutton.click();
		new WebDriverWait(driver,   
				Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(username));
		username.sendKeys(uname);
		password.sendKeys(Pwd);
		UtilClass.clickOn(driver, login, 20);
		return new HomePage();
	}
	
	public SignupPage CreateNewAccount() {
		Signup.click();
		
		return new SignupPage();
	}


}
