package com.CRM.qa.ExtentListners;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.CRM.qa.BaseClass.TestBase;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnerClass extends TestBase implements ITestListener{

	ExtentHtmlReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	public void configureReport()
	{
		htmlReporter= new ExtentHtmlReporter("ExtentListenerReportDemo1.html");
		reports= new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		//add system information/environments info to reports
		reports.setSystemInfo("Machine", "sai");
		reports.setSystemInfo("OS","Windows11");
		
		
		htmlReporter.config().setDocumentTitle("Extent Listener Report Demo");
		htmlReporter.config().setReportName("This is my first Report");
		htmlReporter.config().setTheme(Theme.DARK);
		
	}

	
	public void onTestStart(ITestResult result) {
	   
	  }

	
	  public void onTestSuccess(ITestResult result) {
	  System.out.println("Name of the test method successfully excuted "+result.getName());
	   test=reports.createTest(result.getName());
	   test.log(Status.PASS, MarkupHelper.createLabel("Name of the success test case is: "+result.getName(),ExtentColor.GREEN));
	   for (String group : result.getMethod().getGroups())
			test.assignCategory(group);
	   
		if (result.getThrowable() != null) {
			test.log(Status.PASS, result.getThrowable());
		} else {
			test.log(Status.PASS, "Test " + Status.PASS.toString().toLowerCase()
					+ "ed");
		}
	   
	   
	  }

	
	  public void onTestFailure(ITestResult result) {
	    System.out.println("Name of test method failed:"+result.getName());
	    test=reports.createTest(result.getName());
	    test.log(Status.FAIL, MarkupHelper.createLabel("Name of the skip test case is: "+result.getName(),ExtentColor.RED));
	   
	    File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE );
	    
	    
		String currentDir = System.getProperty("user.dir");
		try {
			FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + result.getName() +"-"+result.getStartMillis()+ ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		 File screenShotFile = new File(currentDir);
		 
	    if(screenShotFile.exists())
	    {
	    	try {
				test.fail("Captured Screenshot is below:" +test.addScreenCaptureFromPath("C:\\Users\\Sai Prathap\\git\\Main-Projects\\HybridFramewok\\screenshots\\"+result.getName()+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }    
		for (String group : result.getMethod().getGroups())
			test.assignCategory(group);

		if (result.getThrowable() != null) {
			test.log(Status.FAIL, result.getThrowable());
		} else {
			test.log(Status.FAIL, "Test " + Status.FAIL.toString().toLowerCase()
					+ "ed");
		}
		
	    
	
	  }


	  public void onTestSkipped(ITestResult result) {
	    System.out.println("Name of test method skipped "+result.getName());
	    test=reports.createTest(result.getName());
	    test.log(Status.SKIP, MarkupHelper.createLabel("Name of the skip test case is: "+result.getName(),ExtentColor.YELLOW));
	  }


	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	  
	  }

	
	  public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	 
	  public void onStart(ITestContext context) {
	    configureReport();
	    System.out.println("On start method invoked.....");
	  }

	
	  public void onFinish(ITestContext context) {
	    System.out.println("On Finished method invoked.....");
	    reports.flush();// it is mandatory to call flush method to ensure information is written ti the started reporter. 
	  }
}
