package genericPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomeListener extends BaseTest implements ITestListener {

	public void onTestStart(ITestResult result) {
		Reporter.log("onTestStart",true);
	}

	
	public void onTestSuccess(ITestResult result) {
		Reporter.log("onTestSuccess",true);
	}

	
	public void onTestFailure(ITestResult result) {
	
		Reporter.log("onTestFailure",true);
		String failedMethodName = result.getMethod().getMethodName();
		Reporter.log("Method Failed Taken Screenshots!!!",true);
	    failedSsMethod(failedMethodName);
		
	}



	
	public void onTestSkipped(ITestResult result) {
		Reporter.log("onTestSkipped",true);
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	
	public void onStart(ITestContext context) {
		Reporter.log("onStart",true);
	}


	public void onFinish(ITestContext context) {
		Reporter.log("onFinish",true);
	}
}
