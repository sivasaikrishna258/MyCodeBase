package com.CRM.qa.Testcases;

import org.testng.annotations.Test;

import com.CRM.qa.BaseClass.TestBase;
import com.CRM.qa.Pages.ContactsPage;
import com.CRM.qa.Pages.HomePage;
import com.CRM.qa.Pages.LoginPage;

public class ContactsPageTest extends TestBase{

	LoginPage loginpage;;
	HomePage homepage;
	ContactsPage contactspage;
	
	

	public ContactsPageTest() {
		super();
	}



	@Test
	public void createNewUserOnContactsPageTest() {
		loginpage=new LoginPage();
		homepage = loginpage.login(property.getProperty("username"), property.getProperty("password"));
		contactspage=homepage.clickOnContactsLink();
		contactspage.clickOnCreateButton();
	}
	
	@Test
	public void verifyingActionsOnContactsPageTest() {
		loginpage=new LoginPage();
		homepage = loginpage.login(property.getProperty("username"), property.getProperty("password"));
		contactspage=homepage.clickOnContactsLink();
		contactspage.clickOnActionsLinkOnContactsPage();
		
		
	}
	
	@Test
	public void selectingCheckBoxesOnContactsPageTest() {
		loginpage=new LoginPage();
		homepage = loginpage.login(property.getProperty("username"), property.getProperty("password"));
		contactspage=homepage.clickOnContactsLink();
		contactspage.selectAllCheckBoxes();;
		
		
	}

}
