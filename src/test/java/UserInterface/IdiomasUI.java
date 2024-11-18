package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IdiomasUI extends config {
    public WebElement seleccionamosidiomas= driver.findElement(By.xpath("//*[@id=\"ej2_dropdownlist_0\"]/span/span"));

}
