package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MenuUI extends config {
    public WebElement buscamos_menu = driver.findElement(By.xpath("//*[@id=\"btn-menu\"]"));
    public WebElement modulo_facturas = driver.findElement(By.xpath("/html/body/app-root/app-root/app-layout/app-menu/ejs-sidebar/div/nav/ul/li[4]/a"));
    public WebElement submodulo_FeeDashboard = driver.findElement(By.cssSelector("#default-sidebar > div > nav > ul > li.int-item-menu.ng-star-inserted.int-item-menu--active > ul > li:nth-child(4) > a > div"));

}
