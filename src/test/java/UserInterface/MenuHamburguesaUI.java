package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MenuHamburguesaUI extends config {
    public WebElement menuhamburguesa = driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/button/i"));

}
