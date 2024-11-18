package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FiltersUI extends config {
    public WebElement seleccionamosfiltros = driver.findElement(By.xpath("//*[@id=\"filter_1\"]/span/span"));

}
