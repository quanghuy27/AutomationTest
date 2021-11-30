package commons;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;

public class GlobalVariable {

    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

    public static ExtentTest getExtentTest() {
        return extentTest.get();
    }

    public static void setExtentTest(ExtentTest test) {
        extentTest.set(test);
    }

    @Getter
    @Setter
    private static ExtentReports extentReports;

    @Getter
    @Setter
    private static ExtentHtmlReporter htmlReporter;

    @Getter
    @Setter
    private static String testDataType;
}


