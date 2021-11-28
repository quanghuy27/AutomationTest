package reports;

import commons.GlobalVariable;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestUtilities {
    private static final String BASE_PATH = "src/test/test-output/screenshot/";

    public static String takeScreenShot(String screenShotName) throws IOException {
        //Create a unique String to use for naming screenshot file
        String dateFormat = new SimpleDateFormat("yyyyMMddhhss").format(new Date());
        //Create object variable of TakeScreenShot class
        String fileName = screenShotName + dateFormat;
        TakesScreenshot ts = (TakesScreenshot) GlobalVariable.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        String dest = BASE_PATH + screenShotName + dateFormat + ".png";
        File destination = new File(dest);
        FileHandler.copy(source, destination);
        String finalDest = "screenshot/" + fileName + ".png";

        return finalDest;
    }
}
