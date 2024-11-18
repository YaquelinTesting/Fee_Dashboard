package Util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static Util.config.driver;

public class ScreenShot {
    public void TakeScreenShot() throws IOException {
        Date d = new Date();
        System.out.println(d.toString());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("C:\\QA Automation\\ScreenShot\\"+sdf.format(d)+".png"));
        System.out.println("Take screenshot succsessfull");
    }


}