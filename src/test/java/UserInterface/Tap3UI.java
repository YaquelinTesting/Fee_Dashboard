package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.ObjectInputFilter;

public class Tap3UI extends config {
    public WebElement clickeamos_ExpenseDetails =  driver.findElement(By.xpath("//*[@id=\"btnDetailsAnalytics\"]"));
}
