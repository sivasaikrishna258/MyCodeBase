package com.CRM.qa.Testcases;

import org.testng.annotations.Test;

import com.CRM.qa.BaseClass.TestBase;
import com.CRM.qa.Pages.SignupPage;

public class SignUpPageTest extends TestBase {

	public SignUpPageTest() {
		super();
	}

	@Test
	public void newUserRegistration() {
	SignupPage	signuppage =new SignupPage();
	signuppage.clickOnSignLink();
	signuppage.clickOnSigupLink();
	signuppage.enterUsername();
	signuppage.selectCheckbox();
	
	}
}
