package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GraficoUI extends config {
    public WebElement buscamos_Grafico = driver.findElement(By.xpath("//*[@id=\"btnGraphicDetailsAnalytics\"]"));

}
