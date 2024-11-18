package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FiltrosTap4UI extends config {
    public WebElement elegimos_periodoprimerclic = driver.findElement(By.xpath("//*[@id=\"defaultid\"]/span/span"));
    public WebElement elegimos_periodosegundoclic = driver.findElement(By.xpath("//*[@id=\"defaultid_tree\"]/ul/li[2]/div[2]/div"));
    public WebElement elegimos_periodotercerclic = driver.findElement(By.xpath("//*[@id=\"defaultid_tree_active\"]"));
}

