package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class config {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public config(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public static String QA = "https://incontrolqa.intelica.com/login/es";
    public static String UAT ="https://uat.intelica.com/site/en";
    public static String PROD = "https://www.intelica.com/site/en";
}
