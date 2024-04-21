package com.CRM.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.qa.BaseClass.TestBase;

public class CompaniesPage extends TestBase {
	
	@FindBy(xpath="//button[contains(text(),'Create')]")
	WebElement  createnewuser;
	
	@FindBy(name="first_name")
	WebElement  firstname;
	
	@FindBy(name="value")
	WebElement  email;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement  savebutton;
	
	public CompaniesPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnCreateButton() {
		createnewuser.click();
		firstname.sendKeys("siva");
		email.sendKeys("sivasaikrishna258@gmail.com");
		savebutton.click();
	}

}
