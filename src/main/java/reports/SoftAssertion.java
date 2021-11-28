package reports;

import com.aventstack.extentreports.Status;
import commons.GlobalVariable;
import helpers.ReportHelper;


import java.io.IOException;

public class SoftAssertion {

    public static void assertEquals(String expected, String actual, String message) {
        if (actual.equalsIgnoreCase(expected)) {
            GlobalVariable.getExtentTest().log(Status.PASS, message);
        } else {
            try {
                String path = TestUtilities.takeScreenShot("CompareString" + expected);
                ReportHelper.logFail(expected, actual, path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void assertEquals(int expected, int actual, String message) {
        if (actual == expected) {
            GlobalVariable.getExtentTest().log(Status.PASS, message);
        } else {
            try {
                String path = TestUtilities.takeScreenShot("CompareInt" + expected);
                ReportHelper.logFail(Integer.toString(expected), Integer.toString(actual), path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
