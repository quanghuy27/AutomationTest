package helpers;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import commons.GlobalVariable;
import org.testng.ITestContext;


public class ExtentReportHelper {
    /**
     * Set up ExtentReports and store its related variables in GlobalVariable class
     *
     * @param context
     */
    public static void setUp(ITestContext context) {
        GlobalVariable.setHtmlReporter(new ExtentHtmlReporter("src/test/test-output/" + context.getName() + ".html"));
        GlobalVariable.setExtentReports(new ExtentReports());
        GlobalVariable.getExtentReports().attachReporter(GlobalVariable.getHtmlReporter());
    }
}
