package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GroupViewUI extends config {
    public WebElement presionamos_boton_group = driver.findElement(By.xpath("//*[@id=\"btnGroupViewAnalytics\"]/span"));

}
