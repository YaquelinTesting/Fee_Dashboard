package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Util.config.driver;

public class BotonApplyUI extends config {
    public WebElement presionamos_boton_apply = driver.findElement(By.xpath("/html/body/app-root/app-root/app-layout/div/div/div/app-index/div/div[1]/div/div[2]/div/div[2]/app-actions-menu/div/div/div[2]/div[2]/app-filter/div[2]/button[1]"));

}
