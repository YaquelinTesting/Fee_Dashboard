package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BtnVariationUI extends config {
    public WebElement buscamos_variation =  driver.findElement(By.xpath("//*[@id=\"btnVariations\"]"));

}
