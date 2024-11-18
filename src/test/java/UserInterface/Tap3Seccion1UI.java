package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tap3Seccion1UI extends config {
   public WebElement seccion1flecha1 =  driver.findElement(By.xpath("//*[@id=\"int-wrapper\"]/div/app-index/div/div[2]/app-expenses-detail/div/div[2]/div/div[2]/ngb-carousel/button[2]/span[1]"));
   public WebElement seccion1flecha2 =  driver.findElement(By.xpath("//*[@id=\"int-wrapper\"]/div/app-index/div/div[2]/app-expenses-detail/div/div[2]/div/div[2]/ngb-carousel/button[1]/span[1]"));

}
