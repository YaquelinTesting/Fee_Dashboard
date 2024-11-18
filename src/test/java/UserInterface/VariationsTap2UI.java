package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VariationsTap2UI extends config {
    public WebElement elegimos_categories =  driver.findElement(By.xpath("//*[@id=\"e-item-1ihma_0\"]/div/div/div/div"));
    public WebElement expense =  driver.findElement(By.xpath("//*[@id=\"e-item-1ihma_1\"]/div/div"));
    public WebElement volumen =  driver.findElement(By.xpath("//*[@id=\"e-item-1ihma_2\"]/div/div/div/div"));
    public WebElement cards =  driver.findElement(By.xpath("//*[@id=\"e-item-1ihma_3\"]/div/div/div/div"));
    public WebElement transaction =  driver.findElement(By.xpath("//*[@id=\"e-item-1ihma_4\"]/div/div/div/div"));

}
