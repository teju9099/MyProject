package Mavan.Mavan;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

 

public class Reporting {

	ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("extent.html");
	ExtentReports extent = new ExtentReports();
	
	public void samplereport(String OperationDescription, String Details ){
		
		extent.attachReporter(htmlreporter);
		ExtentTest test = extent.createTest(OperationDescription);
		test.info(Details);
		//test.startTest("My First Test","Verify WebSite Title");	
		//test.log(LogStatus.PASS, Details);
		extent.flush();	
	}

	
}
