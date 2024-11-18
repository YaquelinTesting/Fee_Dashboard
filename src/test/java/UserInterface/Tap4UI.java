package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tap4UI extends config {
    public WebElement clickeamos_UnitCosts =  driver.findElement(By.xpath("//*[@id=\"btnUnitCostsAnalytics\"]/span"));

}
