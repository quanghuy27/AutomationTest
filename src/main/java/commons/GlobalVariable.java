package commons;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;

public class GlobalVariable {
    @Getter
    @Setter
    private static ExtentTest extentTest;

    @Getter
    @Setter
    private static ExtentReports extentReports;

    @Getter
    @Setter
    private static ExtentHtmlReporter htmlReporter;

    @Getter
    @Setter
    private static WebDriver driver;

    @Getter
    @Setter
    private static String testDataType;
}


