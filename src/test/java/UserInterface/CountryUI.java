package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Util.config.driver;

public class CountryUI extends config {
    public WebElement seleccionamosperiod = driver.findElement(By.xpath("//*[@id=\"filter_2\"]/span/span"));

}
