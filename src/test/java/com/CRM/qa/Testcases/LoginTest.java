package com.CRM.qa.Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.CRM.qa.BaseClass.TestBase;
import com.CRM.qa.Pages.HomePage;
import com.CRM.qa.Pages.LoginPage;
import com.CRM.qa.Utilities.UtilClass;



public class LoginTest extends TestBase {
	
	String sheetname="Login";
	LoginPage loginpage;
	HomePage homepage;
	public LoginTest() {
		super();
	}

	
	@DataProvider
	public Object[][] getdata() throws IOException {
		Object[][] data = UtilClass.getTestData(sheetname);
		return data;
	}
	
	@Test(dataProvider="getdata")
	public void LogintoCRMApplication(String username,String pwd) {
		loginpage=new LoginPage();
		homepage=loginpage.login(username,pwd);
		
	}


	
	
	
	

}
