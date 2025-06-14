package listnerUtility;

import java.io.File;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import configBaseClass.BaseClass;



public class ListnersImplementationClass implements ITestListener, ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		Reporter.log("Report configuration", true);
	}

	@Override
	public void onFinish(ISuite suite) {
		Reporter.log("Report BackUp", true);
	}

	@Override
	public void onTestStart(ITestResult result) {

		Reporter.log("======" + result.getMethod().getMethodName() + "Execution Started========", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("=====" + result.getMethod().getMethodName() + "=====Success", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {

		String TestName = result.getMethod().getMethodName();
		Reporter.log("=====" + TestName + "=====Failure", true);

		Date date = new Date();
		String newD = date.toString().replace(" ", "_").replace(":", "_");

		TakesScreenshot ts = (TakesScreenshot) BaseClass.sdriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/" + TestName + "_" + newD + ".png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("=====" + result.getMethod().getMethodName() + "=====Skipped", true);
	}

}
