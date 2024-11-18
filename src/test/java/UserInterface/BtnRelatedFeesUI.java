package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BtnRelatedFeesUI extends config {
    public WebElement presionamos_boton_realtedfees = driver.findElement(By.xpath("//*[@id=\"btnrelatedFeesAnalytics\"]"));

}
