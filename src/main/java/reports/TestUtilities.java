package reports;

import commons.GlobalVariable;
import helpers.DriverHelper;
import helpers.PageHelper;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestUtilities {
    private static final String BASE_PATH = "C:\\Users\\Jin-PC\\IdeaProjects\\AutoTest\\src\\test\\test-output\\screenshot\\";

    public static String captureScreen(){
        TakesScreenshot ts = (TakesScreenshot) DriverHelper.getDriver();
        File src = ts.getScreenshotAs(OutputType.FILE);
        String destination = BASE_PATH+getCurrentDateAndTime()+".png";
        System.out.println(destination);
        File finalDestination = new File(destination);
        try{
            FileUtils.copyFile(src,finalDestination);
        } catch (IOException e){
            System.out.print("Capture Failed "+e.getMessage());
        }

        return destination.substring(59);
    }

    public static String getCurrentDateAndTime(){
        String str = null;
        try{
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SSS");
            Date date = new Date();
            str= dateFormat.format(date);
            str = str.replace(" ", "").replaceAll("/", "").replaceAll(":", "");
        }
        catch(Exception e){

        }
        return str;
    }
}
