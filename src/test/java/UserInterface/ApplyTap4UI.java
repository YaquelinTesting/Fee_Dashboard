package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ApplyTap4UI extends config {
    public WebElement presionamos_apply = driver.findElement(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div[2]/button[1]"));

}
