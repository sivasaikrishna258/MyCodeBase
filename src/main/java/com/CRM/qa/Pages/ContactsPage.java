package com.CRM.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.qa.BaseClass.TestBase;
import com.CRM.qa.Utilities.UtilClass;

public class ContactsPage extends TestBase{
	Actions act=new Actions(driver);

	@FindBy(xpath="//button[contains(text(),'Create')]")
	WebElement  createnewuser;
	
	@FindBy(name="first_name")
	WebElement  firstname;
	
	@FindBy(name="last_name")
	WebElement  lastname;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement  savebutton;
	
	@FindBy(xpath="//div[@name='action']")
	WebElement actions;
	
	@FindBy(xpath="//tr[3]//td[1]")
	WebElement  checkboxSelection;
	
	@FindBy(xpath="//tr[2]//td[1]")
	WebElement  checkboxSelection1;
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnCreateButton() {
		createnewuser.click();
		firstname.sendKeys("siva");
		lastname.sendKeys("sai");
		savebutton.click();
	}
	
	public void clickOnActionsLinkOnContactsPage() {
		UtilClass.clickOn(driver, actions, 30);
	}
	
	public void selectAllCheckBoxes() {
		act.moveToElement(actions).perform();

		UtilClass.clickOn(driver, checkboxSelection, 30);
		UtilClass.clickOn(driver, checkboxSelection1, 30);


	}
	

}
