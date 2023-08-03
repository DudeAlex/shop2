package utils;

import constants.Config;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestUtils {
    public static void takeScreenShot(WebDriver driver, Method method){
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

         getScreenshotFileName(method);


        File target = new File(Config.SHREENSHOTS_ROOT + getScreenshotFileName(method));
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(source,target);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String getScreenshotFileName(Method method) {
        Date currentDate = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");

        String current = dateFormat.format(currentDate);

        return String.format("%s-%s.png", method.getName(), current);
    }
}
