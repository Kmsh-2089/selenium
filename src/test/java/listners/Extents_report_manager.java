package listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extents_report_manager implements ITestListener
{
		public ExtentSparkReporter sparkrepoter;// Handle UI Of the report 
		public ExtentReports extent;// handle the populate common info in the report 
		public ExtentTest test;//creating test case entry and update status of the test in the reports 
		
		public void onStart(ITestContext context) 
		{
			sparkrepoter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myreports.html");// need to pass path of the folder
			sparkrepoter.config().setDocumentTitle("Automation Report");//title of the report
			sparkrepoter.config().setReportName("Fuctional Testing");// name of the report
			sparkrepoter.config().setTheme(Theme.STANDARD);
			
			extent= new ExtentReports();
			extent.attachReporter(sparkrepoter);
			extent.setSystemInfo("computer name", "Mahadev");
			extent.setSystemInfo("Enviorment", "QA");
			extent.setSystemInfo("Tester name", "Kamesh");
			extent.setSystemInfo("os", "Windows 10");
			extent.setSystemInfo("Browser name", "Chrome");
		}
		public void onTestSuccess(ITestResult result) 
		{
			test=extent.createTest(result.getName());//create new entry in the report
			test.log(Status.PASS,"Test case PASSED is:"+result.getName());// update the status pass/fails/skipped
			   
		}
		public void onTestFailure(ITestResult result) 
		{
			test=extent.createTest(result.getName());
			test.log(Status.FAIL,"Test case FAIL is:"+result.getName());
			test.log(Status.FAIL,"Test case FAIL cause is:"+result.getThrowable());
			    
	    }
		public void onTestSkipped(ITestResult result) 
		{
			test=extent.createTest(result.getName());
			test.log(Status.SKIP,"Test case SKIPPED is:"+result.getName());
			 
		}
		public void onFinish(ITestContext context) 
		{
			extent.flush(); 	 
		}
	
	
	
}
