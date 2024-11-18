package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OpcionFiltersUI extends config {
    public WebElement filtrosopcion = driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[1]/div[2]/button[1]"));

}
