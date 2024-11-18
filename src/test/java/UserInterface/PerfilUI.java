package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PerfilUI extends config {
    public WebElement cambiamosperfil = driver.findElement(By.xpath("//*[@id=\"ej2_dropdownlist_1\"]/span/input"));

}
