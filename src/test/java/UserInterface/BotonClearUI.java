package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BotonClearUI extends config {
    public WebElement presionamos_boton_clear = driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div[2]/button[2]"));

}
