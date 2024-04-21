package com.CRM.qa.Testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM.qa.BaseClass.TestBase;
import com.CRM.qa.Pages.CalendarPage;
import com.CRM.qa.Pages.CompaniesPage;
import com.CRM.qa.Pages.ContactsPage;
import com.CRM.qa.Pages.HomePage;
import com.CRM.qa.Pages.LoginPage;

/*
 * all actions  on  homepage
 */

public class HomaPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactspage;
	CalendarPage calendarpage;
	CompaniesPage companiespage;
	
	
	
	
	public HomaPageTest() {
		super();
	}

	
	@Test(priority=3)
	public void verifyUserNameTest() {
		loginpage=new LoginPage();
		homepage=loginpage.login(property.getProperty("username"), property.getProperty("password"));
	
	}
	
	@Test(priority=0)
	public void clickOnContactsLinkTest() {
		loginpage=new LoginPage();
		homepage=loginpage.login(property.getProperty("username"), property.getProperty("password"));
		contactspage=homepage.clickOnContactsLink();
		System.out.println(Thread.currentThread().getId());

	}
	
	@Test(priority=1)
	public void clickOncalendarLinkTest() {
		loginpage=new LoginPage();
		homepage=loginpage.login(property.getProperty("username"), property.getProperty("password"));
		calendarpage=homepage.clickOnCalenderLink();
	}
	
	@Test(priority=2)
	public void clickOnCompaniesLinkTest() {
		loginpage=new LoginPage();
		homepage=loginpage.login(property.getProperty("username"), property.getProperty("password"));
		companiespage=homepage.clickOnCompaniesrLink();
	}

}
