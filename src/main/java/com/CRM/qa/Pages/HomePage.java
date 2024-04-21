package com.CRM.qa.Pages;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.CRM.qa.BaseClass.TestBase;
import com.CRM.qa.Utilities.UtilClass;

public class HomePage extends TestBase{

	@FindBy(xpath="//*[contains(text(),'Advanapu  Sivasaikrishna1 ')]")
	WebElement  uservalidation;

	@FindBy(xpath ="//*[contains(text(),'Calendar')]")
	WebElement  calendarlink;

	@FindBy(xpath="//*[contains(text(),'Contacts')]")
	WebElement  contactslink;

	@FindBy(xpath="//*[contains(text(),'Companies')]")
	WebElement  companieslink;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public boolean validationOfUserOnHeader() {
		new WebDriverWait(driver,   
				Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(uservalidation));
		return  uservalidation.isDisplayed();
		
	}

	public ContactsPage clickOnContactsLink() {
		UtilClass.clickOn(driver, contactslink, 20);

		return new ContactsPage();
	}

	public CalendarPage clickOnCalenderLink() {
		new WebDriverWait(driver,   
				Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(calendarlink));
		calendarlink.click();

		return new CalendarPage();
	}

	public CompaniesPage clickOnCompaniesrLink() {
		new WebDriverWait(driver,   
				Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(companieslink));
		
		companieslink.click();

		return new CompaniesPage();
	}



}
