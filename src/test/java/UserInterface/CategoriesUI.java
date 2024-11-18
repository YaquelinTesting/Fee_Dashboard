package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CategoriesUI extends config {
    public WebElement presionamos_boton_variation = driver.findElement(By.xpath("//*[@id=\"btnVariations\"]"));

}
