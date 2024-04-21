package com.CRM.qa.Testcases;

import org.testng.annotations.Test;

import com.CRM.qa.BaseClass.TestBase;
import com.CRM.qa.Pages.CompaniesPage;
import com.CRM.qa.Pages.HomePage;
import com.CRM.qa.Pages.LoginPage;

public class CompaniesPageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	CompaniesPage companiesPage;
	public CompaniesPageTest() {
		super();
	}


	@Test
	public void enterNewComapnyyDetailsOnCompaniesPageTest() {
		loginpage=new LoginPage();
		homepage = loginpage.login(property.getProperty("username"), property.getProperty("password"));
		companiesPage = homepage.clickOnCompaniesrLink();
		companiesPage.clickOnCreateButton();

	}


}
