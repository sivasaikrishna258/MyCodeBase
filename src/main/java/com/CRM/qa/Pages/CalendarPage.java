package com.CRM.qa.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.qa.BaseClass.TestBase;
import com.CRM.qa.Utilities.UtilClass;

public class CalendarPage extends TestBase {
	
	Actions act=new Actions(driver);

	
	@FindBy(xpath="//button[contains(text(),'Events')]")
	WebElement eventslink;
	
	@FindBy(xpath="//div[@class='rbc-date-cell']")
	List<WebElement> datepiker;
	
	
	public CalendarPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnEventsLink() {
		
		act.moveToElement(eventslink).perform();
		
		
		for( WebElement e:datepiker) {
			
			if(e.getText().equals("03")) {
				UtilClass.clickOn(driver,e, 30);
				break;
			}
		}
		
	}
}
