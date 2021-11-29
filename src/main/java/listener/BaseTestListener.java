package listener;

import commons.GlobalVariable;
import helpers.DriverHelper;
import helpers.ExtentReportHelper;
import helpers.ReportHelper;
import helpers.XMLHelper;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import reports.HtmlLog;
import reports.TestUtilities;

import java.io.IOException;

public class BaseTestListener extends DriverHelper implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(result.getName() + " - on test start");

        GlobalVariable.setExtentTest(GlobalVariable.getExtentReports().createTest(result.getName()));
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        HtmlLog.stepInfo("Test case finished.");
        GlobalVariable.getExtentReports().flush();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        String path = null;
        try {
            path = TestUtilities.takeScreenShot(result.getMethod().getMethodName());
        } catch (IOException e) {
            e.printStackTrace();
        }
        ReportHelper.logFail(result.getMethod().getMethodName(), path);
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println(context.getName() + " - Test start");
        XMLHelper.getTestDataType(context);
        DriverHelper.setUp();
        ExtentReportHelper.setUp(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println(context.getName() + " - Test end.");
        GlobalVariable.getDriver().close();
    }
}
